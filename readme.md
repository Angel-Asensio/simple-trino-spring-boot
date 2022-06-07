# simple-trino-spring-boot

This is an extremely simple spring boot project that uses the jdbc template
to access a Trino cluster. 

```
# Either clone this repo or download it directly
git clone git@github.com:Angel-Asensio/simple-trino-spring-boot.git

Edit the file under src/main/resources/application.properties and replace
the placeholders TRINO_IP and TRINO_USER with your corresponding values:

spring.datasource.url=jdbc:trino://TRINO_IP:8080?user=TRINO_USER
```

From your main directory, build the project and run it: 
```
simple-trino-spring-boot > ./mvnw clean package && java -jar target/simple-trino-spring-boot-1.0.jar

2022-06-07 11:46:25.852  INFO 6063 --- [           main] i.t.s.TrinoSpringBoot                    : No active profile set, falling back to default profiles: default
2022-06-07 11:46:26.340  INFO 6063 --- [           main] i.t.s.TrinoSpringBoot                    : Started TrinoSpringBoot in 0.7 seconds (JVM running for 0.912)
2022-06-07 11:46:26.341  INFO 6063 --- [           main] i.t.s.TrinoSpringBoot                    : Querying Trino to verify the connection ...
2022-06-07 11:46:26.345  INFO 6063 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2022-06-07 11:46:26.400  INFO 6063 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
2022-06-07 11:46:27.608  INFO 6063 --- [           main] i.t.s.TrinoSpringBoot                    : Result: 1
2022-06-07 11:46:27.612  INFO 6063 --- [ionShutdownHook] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Shutdown initiated...
2022-06-07 11:46:27.615  INFO 6063 --- [ionShutdownHook] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Shutdown completed.
```