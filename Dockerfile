FROM openjdk:17
COPY target/devops-jenkins-0.0.1-SNAPSHOT.jar devops-jenkins-0.0.1-SNAPSHOT.jar
CMD java -jar devops-jenkins-0.0.1-SNAPSHOT.jar 