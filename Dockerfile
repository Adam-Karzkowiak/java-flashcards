FROM amazoncorretto:11-alpine-jdk
MAINTAINER javaflashcards.com
COPY target/java-flashcards-0.0.1-SNAPSHOT.jar java-flashcards-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/java-flashcards-0.0.1-SNAPSHOT.jar"]