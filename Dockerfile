FROM openjdk:11
EXPOSE 8080
ADD target/jenkins-docker-one.jar jenkins-docker-one.jar
ENTRYPOINT ["java","-jar","/jenkins-docker-one.jar"]