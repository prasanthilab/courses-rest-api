#FROM openjdk:21
#COPY target/courses-rest-0.0.1-SNAPSHOT.jar  /app/
#WORKDIR  /app/
#ENTRYPOINT ["java", "-jar", "courses-rest-0.0.1-SNAPSHOT.jar"]
#EXPOSE 8000


FROM openjdk:21
ADD target/*.jar app.jar
ENTRYPOINT [ "java", "-jar", "app.jar" ]