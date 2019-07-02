FROM openjdk:8-jre-alpine

ENV JAVA_TOOL_OPTIONS=""
ENV SERVER_PORT=8080

COPY target/cddemo-5.0-SNAPSHOT.jar /cddemo-5.0-SNAPSHOT.jar

EXPOSE 8080

RUN adduser -S aUser

USER aUser

ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/cddemo-5.0-SNAPSHOT.jar"]