FROM openjdk:11
COPY target/backend.war  /usr/app/
WORKDIR  /usr/app/
ENTRYPOINT ["java", "-jar", "backend.war"]
EXPOSE 8090