FROM openjdk:8-jre-alpine

ENV JAVA_TOOL_OPTIONS=""
ENV SERVER_PORT=8080

ADD cddemo-0.0.1-SNAPSHOT.jar /cddemo-0.0.1-SNAPSHOT.jar

EXPOSE 8080

RUN adduser -S aUser

USER aUser

ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/cddemo_pub.jar"]