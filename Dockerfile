FROM develar/java:8u45

RUN mkdir /reader
RUN mkdir /reader/data
COPY application/build/libs/application.jar /reader/
COPY application/build/dependencies /reader/dependencies
WORKDIR /reader
ENTRYPOINT []
CMD java -classpath "application.jar:dependencies/*" com.richodemus.kotlin.dropwizard.MyApplication server
EXPOSE 8080 8081 5005

