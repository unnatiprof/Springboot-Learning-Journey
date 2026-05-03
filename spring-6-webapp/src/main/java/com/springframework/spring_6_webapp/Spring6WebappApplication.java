package com.springframework.spring_6_webapp; // tells inside which package the file is

import org.springframework.boot.SpringApplication;// imports SpringApplication class so that we can start our application
import org.springframework.boot.autoconfigure.SpringBootApplication;// imports the annotation @SpringBootApplication

@SpringBootApplication// annotation

/* @SpringBootAnnotation implements three annotations internally
 * @Configration : tells spring boot that this is the Configration class
 * @EnableAutoConfigration : spring boot automatically configures the required configration For eg: if we have JPA then spring boot will try to set it up
 * @ComponentScan : scans the current package and its sub packages, therefore @Controller, @Service, @Component gets detected
 */
public class Spring6WebappApplication {

	public static void main(String[] args) {
		SpringApplication.run(Spring6WebappApplication.class, args);
		
		/* SpringApplication.run(Spring6WebappApplication.class, args);
		 * 
		 * After this line Spring:

           1. Makes the Application context.
           2. Scans the Beans.
           3. Creates Controller, Service, Repository objects.
           4. Setup the Database.
           5. Starts the Embedded Tomcat server.
           6. Executes the CommandLineRunner classes.
		 */
		System.out.println("Unnati");
	}

}
