cf create-org Facebook
cf create-space Development -o Facebook
cf create-space Project -o Facebook

cf target Facebook

cf create-user Alfie Alfie
cf set-space-role Alfie Facebook Development SpaceDeveloper

cf create-user Gracy Gracy
cf set-space-role Gracy Facebook Development SpaceAuditor

cf create-user Mathew Mathew
cf set-space-role Mathew Facebook Development SpaceManager

cf create-user Tisha Tisha
cf set-space-role Tisha Facebook Project SpaceManager


cf create-org Instagram

cf create-space Development -o Instagram
cf create-space Project -o Instagram

cf target Instagram

cf create-user Joe Joe
cf set-space-role Joe Instagram Development SpaceDeveloper

cf create-user Niha Niha
cf set-space-role Niha Instagram Development SpaceAuditor

cf create-user Tom Tom 
cf set-space-role Tom Instagram Project SpaceDeveloper

cf create-user Nandita Nandita
cf set-space-role Nandita Instagram Project SpaceManager

