FROM openjdk:8
EXPOSE 9090
ADD target/spring-cicd-Integrate.jar spring-cicd-integrate.jar
ENTRYPOINT ["java","-jar","/spring-cicd-integrate.jar"]