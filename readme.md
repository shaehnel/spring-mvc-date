# Spring MVC date parsing

Issue: http://stackoverflow.com/questions/33401122/spring-mvc-parse-date-and-show-binding-errors

To start this app, run 

    spring-boot:run

- Go to http://localhost:8080/
- Submit the form with `1999-10-24`
- Check the console output for the messages described in the link above
- Submit the form with `hello`
- See the `400`

Code: check `/src/main/java/com/sample/web/Example.java`