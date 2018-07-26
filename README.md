# spring-docker

This application is available on TeamCity. You can build it by running the Build commands here: http://teamcity.conygre.com:8080/viewType.html?buildTypeId=Developers_NewYork_Zoe_Build
Once built, this application can be run on a Docker container. 
On a Linux virtual machine, ensure you have Docker installed. Run the following commands:

sudo su
service restart docker
docker pull docker.conygre.com:5000/zoegrippo
docker run docker.conygre.com:5000/zoegrippo

The Spring Boot application should be up and running!
