FROM amazoncorretto:17-alpine
EXPOSE 8080
ADD target/learn-web-springboot-docker-hello.jar learn-web-springboot-docker-hello.jar
ENTRYPOINT ["java", "-jar", "/learn-web-springboot-docker-hello.jar"]
