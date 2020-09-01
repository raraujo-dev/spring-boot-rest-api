# Spring-Boot Camel QuickStart

This example demonstrates how you can use Apache Camel with Spring Boot.

The quickstart uses Spring Boot to configure a little application that includes a Camel route that triggers a message every 5th second, and routes the message to a log.

### Building

The example can be built with

    mvn clean install

### Running the project in OpenShift

It is assumed that:

- OpenShift platform is already running and you have already logged into your Openshit Cluster using 'oc client' tool.
- The project is already pushed into your local machine

1 - Import the fuse image

oc import-image fuse7/fuse-java-openshift --from=registry.access.redhat.com/fuse7/fuse-java-openshift --confirm

2 - Create a new build config on Openshift pointing to the Fuse Image

oc new-build --binary=true --image-stream=fuse-java-openshift  --name=simple-rest-api

3 - Start the build pointing the '--from-dir' variable to the project folder

oc start-build simple-rest-api --from-dir=. --follow

4 - Create a new app

oc new-app simple-rest-api
