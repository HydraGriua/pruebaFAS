FROM openjdk:11
VOLUME /tmp
ARG build/libs/*.jar
COPY build/libs/*.war config-service.war
EXPOSE 8081
ENTRYPOINT ["java","-jar","/config-service.war"]