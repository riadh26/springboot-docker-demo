FROM adoptopenjdk/openjdk16
COPY build/libs/*.jar app.jar
COPY wait-for-it.sh ./
RUN chmod +x ./wait-for-it.sh
EXPOSE 8080
ENTRYPOINT ["./wait-for-it.sh", "app-db:3306", "--", "java","-jar","/app.jar"]