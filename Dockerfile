FROM openjdk:11-jdk-slim

WORKDIR /app
COPY <caminho para a main(src/Main.java)> .
RUN javac <nome do arquivo executável>
CMD [”java”, “<nome do arquivo executável>”]
