FROM openjdk:8
ADD target/springboot-jpa.jar springboot-jpa.jar
EXPOSE 8086
ENTRYPOINT ["java","-Dspring.profiles.active=container","-jar","springboot-jpa.jar"]
