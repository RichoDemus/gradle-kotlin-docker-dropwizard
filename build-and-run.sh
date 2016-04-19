./gradlew clean build copyDependencies buildImage && docker run -it --rm -p 8080:8080 richodemus/gradle-kotlin-docker-dropwizard:latest
