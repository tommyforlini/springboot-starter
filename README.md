# springboot-starter

A starting template for gradle springboot 2.x microservice projects.

>Includes
* SpringBoot Starter (example TheApplication.java)
* SpringBoot Starter Web (example UserController.java)

## Build

Type 

    $ ./gradlew clean build
    
to build the project. The final SpringBoot **executable** binary will be located `build/libs/<artifactname>.jar`

## Running on local

Type 

    $ ./gradlew clean bootRun

Open browser to url ```http://localhost:8080/api/users``` to receive data from the @RestController UserController.java
