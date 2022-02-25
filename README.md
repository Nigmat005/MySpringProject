                           CYDEO JAVA DEVELOPER PROGRAM
Spring Framework
Spring Project Structure:

src/main/java : Contains application source code
src/main/resources : Contains non-java resources
src/test/java : Contains test code


mvnw and mwnw.cmd : These are maven wrapper scrips. You can use these scripts to build your project, even if you do not have Maven installed on your machine.

pom.xml : This is the Maven build specification.

CydeoApplication.java : This is the Spring boot main class that bootstrapts the project.

application.properties : This file initially empty but offers a place where you can specify configuration properties.

static : Contains any static content(images,css,js,etc)

templates : Contains template files that will be used to render content to the browser(Thymeleaf)

CydeoApplicationTests :  This is a simple test class that ensures that the Spring application contect loads successfully. You will add more tests to the mix as you develop the application.
