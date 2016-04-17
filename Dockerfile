FROM develar/java:8u45

RUN mkdir /reader
RUN mkdir /reader/data
COPY application/build/libs/application.jar /reader/
COPY application/build/dependencies /reader/dependencies
WORKDIR /reader
ENTRYPOINT []
CMD java -classpath "application.jar:dependencies/*" com.richodemus.kotlin.dropwizard.MyApplication server
#CMD ["java","-classpath","\"application.jar:dependencies/*\"","com.richodemus.kotlin.dropwizard.MyApplication","server"]
#cmd ["java","-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=5005","-XX:+UseConcMarkSweepGC","-XX:+CMSParallelRemarkEnabled","-server","-jar","web-1.0-SNAPSHOT.jar","server","config.yaml"]
#CMD ["java","-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=5005","-XX:+UseConcMarkSweepGC","-XX:+CMSParallelRemarkEnabled","-server","-classpath","\"web.jar:dependencies/*\"","com.richo.reader.web.dropwizard.ReaderApplication","server","config.yaml"]
EXPOSE 8080 8081 5005

