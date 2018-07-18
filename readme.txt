docker-compose build
docker stack deploy -c deploy.yml demo
curl -H Host:demoapp.westeurope.cloudapp.azure.com http://40.74.51.148


ACR_LOGINSERVER="krb8registry.azurecr.io"
BUILD_NUMBER="1"
WEB_IMAGE_NAME="${ACR_LOGINSERVER}/demoapp:swarm${BUILD_NUMBER}"
