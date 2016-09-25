FROM develar/java:8u45

RUN mkdir /reader
RUN mkdir /reader/data
COPY application/build/libs/application.jar /reader/
COPY application/build/dependencies /reader/dependencies
COPY config.yaml /reader
WORKDIR /reader
ENTRYPOINT []
CMD java -classpath "application.jar:dependencies/*" com.richodemus.kotlin.dropwizard.MyApplication server config.yaml
EXPOSE 8080 8081
