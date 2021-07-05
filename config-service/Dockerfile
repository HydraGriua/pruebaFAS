FROM openjdk:11
VOLUME /tmp
ARG build/libs/*.jar
COPY build/libs/*.jar config-service.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","/config-service.war"]