#!/bin/bash -x

bosh create-release
bosh -e vbox upload-release
bosh -e vbox -d roboweb-0.1 deploy manifest.yml
