FROM openjdk:12
ADD target/covid19.war covid19.war
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "covid19.war"]