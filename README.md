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


Build Specification :

<parent> : This specifies that your project has spring-boot-starter-parent as its parent POM. This parent POM provides dependency management for several libraries commonly used in Spring projects. For those libraries covered by the parent POM, you wont have to specify a version, because it is inherited from the parent.


All dependencies have the work starter in their artifact ID.

Your build file will be significantly smaller and easier to manage because you wont need to declare a dependency on every library you might need.

You are able to think of your dependencies in terms of what capabilities they provide, rather than their library names(web starter dependency)

You are freed from the burden of worrying about library versions. You only need to worry about which version of Spring Boot you are using.


Spring Boot plugin :

- It provides a Maven goal that enables you to run the application using maven
- It ensures that all dependency libraries are included within the executable JAR file