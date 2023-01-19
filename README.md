# Rick-And-Morty-App
Test task that get and process info from external API  https://rickandmortyapi.com/
# Features
- automatic (once a day) update and save to DB info about all movie characters from API
- can random get movie character  (http://localhost:8080/movie-character/random)
- can get movie character that contain string in name (http://localhost:8080/movie-character/by-name?name= *you Part of name*)
# Project structure
Project uses 3-tier architecture:
1. Data access tier -> handled by Repository;
2. Business logic tier -> handled by Service;
3. Presentation tier -> handled by Controllers.
# Technologies
- Maven
- Tomcat
- Swagger
- Hibernate
- PostgreSQL
- Spring boot (Core, WebMVC)
# Instructions to run my project
1. Clone this repository
2. Configure connection to your database in  ["application.properties"](src/main/resources/application.properties)
3. Build project
```shell
mvn clean package
```
4. Run project
*you cat use swagger http://localhost:8080/swagger-ui.html*
