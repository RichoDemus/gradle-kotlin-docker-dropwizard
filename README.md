# DAWIKBWGRID
Dropwizard app written in Kotlin built with Gradle running in Docker

## Running:
    ./build-and-run.sh
point browser at [localhost:8080](http://localhost:8080)

## Finding outdated dependencies
    ./gradlew dependencyUpdates

## Updating gradle wrapper version
    ./gradlew wrapper --gradle-version 2.14.1
Gradle will change the wrapper from bin to all, change back to all
