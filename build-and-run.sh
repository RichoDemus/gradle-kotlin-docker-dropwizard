./gradlew clean build copyDependencies && ./build.sh && docker run -it --rm -p 8080:8080 richodemus/gradle-kotlin-docker-dropwizard:latest
