# Spring-Boot REST API
This example is a simple Rest API replying the current datetime.

### Building

The example can be built with

    mvn clean install

### Running the project in OpenShift

It is assumed that:

- OpenShift platform is already running and you have already logged into your Openshit Cluster using 'oc client' tool.
- The Java project is already pulled into your local machine


1 - Import the Open JDK 8 image

    oc import-image redhat-openjdk-18/openjdk18-openshift --from=registry.access.redhat.com/redhat-openjdk-18/openjdk18-openshift --confirm
    
2 - Create a Openshift Project - teste is the example project name

    oc new-project teste

3 - Create a new build config on Openshift pointing to the Fuse Image

    oc new-build --binary=true --image-stream=openjdk18-openshift  --name=simple-rest-api

4 - Start the build pointing the '--from-dir' variable to the project folder

    oc start-build simple-rest-api --from-dir=. --follow

5 - Create a new app

    oc new-app simple-rest-api
    
Obs: Use SPRING_PROFILES_ACTIVE environment variable to specify the spring profile
