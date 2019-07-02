FROM openjdk:8-jre-alpine

ENV JAVA_TOOL_OPTIONS=""
ENV SERVER_PORT=8080

COPY target/cddemo-3.0.jar /cddemo-3.0.jar

EXPOSE 8080

RUN adduser -S aUser

USER aUser

ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/cddemo-3.0.jar"]