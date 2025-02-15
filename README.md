# Jakarta EE project base
This is a sample Jakarta EE application for project starting. It is based on [Eclipse starter for Jakarta EE](https://start.jakarta.ee/).

You can run the application by executing the following command from the directory where this file resides. Please ensure you have installed a [Java SE 17+ implementation](https://adoptium.net/?variant=openjdk17) appropriate for your Jakarta EE version and runtime choice (we have tested with Java SE 17). Note, the [Maven Wrapper](https://maven.apache.org/wrapper/) is already included in the project, so a Maven install is not actually needed.

```
./mvnw clean package wildfly:dev
```

Once the runtime starts, you can access the project at http://localhost:8080/jakartaee-hello-world.

You can also run the project via Docker. To build the Docker image, execute the following commands from the directory where this file resides. Please ensure you have installed a [Java SE 17+ implementation](https://adoptium.net/?variant=openjdk17) appropriate for your Jakarta EE version/runtime choice and [Docker](https://docs.docker.com/get-docker/) (we have tested with Java SE 17). Note, the [Maven Wrapper](https://maven.apache.org/wrapper/) is already included in the project, so a Maven install is not actually needed. You may first need to execute `chmod +x mvnw`.

```
./mvnw clean package
docker build -t jakartaee-hello-world:v1 .
```

You can then run the Docker image by executing:

```
docker run -it --rm -p 8080:8080 jakartaee-hello-world:v1
```

Once the runtime starts, you can access the project at http://localhost:8080/jakartaee-hello-world.
