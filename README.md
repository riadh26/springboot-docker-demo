# Spring-Boot Docker Demo
A simple Spring Boot web application that uses Docker and Docker Compose, it takes input from a user 
and saves it into a Mysql database.

## Build
First, to build and package the project run the `bootJar` task from Gradle
```shell
gradle bootJar
```

## Run 
This project is going to start a Spring Boot application and a Mysql database instance.

#### Before you start
- You need to have Docker and Docker Compose installed.
- Make sure to build the project as shown before.

Then you just need to run 
```shell
docker-compose up
``` 
If you made some changes to the project files, do not forget to first rebuild the project, then rebuild
the image while starting services with docker-compose `docker-compose up --build`

#### endpoints
You can access the input form at `http://localhost:8080/users`

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

## License
[MIT](LICENSE)