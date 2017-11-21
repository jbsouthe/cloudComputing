#!/bin/bash -x
#https://banck.net/2017/03/deploying-cloud-foundry-virtualbox-using-bosh-cli-v2/

(cd ~/Downloads; wget https://s3.amazonaws.com/bosh-cli-artifacts/bosh-cli-2.0.45-linux-amd64 )
chmod +x ~/Downloads/bosh-cli-*
sudo mv ~/Downloads/bosh-cli-* /usr/local/bin/bosh

git clone https://github.com/cloudfoundry/bosh-deployment ~/workspace/bosh-deployment
mkdir -p ~/workspace/deployments/vbox

cd ~/Downloads
wget --content-disposition https://bosh.io/d/stemcells/bosh-warden-boshlite-ubuntu-trusty-go_agent?v=3468.5

cd ~/workspace/deployments/vbox
bosh create-env ~/workspace/bosh-deployment/bosh.yml \
  --state ~/workspace/deployments/vbox/state.json \
  -o ~/workspace/bosh-deployment/virtualbox/cpi.yml \
  -o ~/workspace/bosh-deployment/virtualbox/outbound-network.yml \
  -o ~/workspace/bosh-deployment/bosh-lite.yml \
  -o ~/workspace/bosh-deployment/bosh-lite-runc.yml \
  -o ~/workspace/bosh-deployment/jumpbox-user.yml \
  --vars-store ~/workspace/deployments/vbox/creds.yml \
  -v director_name="Bosh Lite Director" \
  -v internal_ip=192.168.50.6 \
  -v internal_gw=192.168.50.1 \
  -v internal_cidr=192.168.50.0/24 \
  -v outbound_network_name=NatNetwork

bosh -e 192.168.50.6 --ca-cert <(bosh int ~/workspace/deployments/vbox/creds.yml --path /director_ssl/ca) alias-env vbox

export BOSH_CA_CERT=`bosh int ~/workspace/deployments/vbox/creds.yml --path /director_ssl/ca`
export BOSH_CLIENT=admin
export BOSH_CLIENT_SECRET=`bosh int ~/workspace/deployments/vbox/creds.yml --path /admin_password`
export BOSH_ENVIRONMENT=vbox

git clone https://github.com/cloudfoundry/cf-deployment ~/workspace/cf-deployment
cd ~/workspace/cf-deployment

bosh update-cloud-config ~/workspace/cf-deployment/iaas-support/bosh-lite/cloud-config.yml

bosh -d cf deploy ~/workspace/cf-deployment/cf-deployment.yml -o ~/workspace/cf-deployment/operations/bosh-lite.yml --vars-store ~/workspace/deployments/vbox/deployment-vars.yml -v system_domain=bosh-lite.com -o ~/workspace/cf-deployment/operations/use-compiled-releases.yml

#bosh -d cf deploy ~/workspace/cf-deployment/cf-deployment.yml -o ~/workspace/cf-deployment/operations/bosh-lite.yml --vars-store ~/workspace/deployments/vbox/deployment-vars.yml -v system_domain=bosh-lite.com 

sudo route add -net 10.244.0.0/16 gw 192.168.50.6

cf login -a https://api.bosh-lite.com --skip-ssl-validation -u admin -p $(bosh interpolate ~/workspace/deployments/vbox/deployment-vars.yml --path /cf_admin_password)

cf create-org cloudfoundry
cf target -o cloudfoundry
cf create-space development
cf target -o cloudfoundry -s development

# deploy hello world
git clone https://github.com/vchrisb/cf-helloworld ~/workspace/cf-helloworld
cd ~/workspace/cf-helloworld
cf push
