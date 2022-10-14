package com.greatlearning.library;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.greatlearning.library.model.GreatLearning;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class SpringBootLibraryDesignApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLibraryDesignApplication.class, args);
		System.out.println("Hello Spring Boot");
		System.out.println("Hi Vilas");
	}

	@Override
	public void run(String... args) throws Exception {
		GreatLearning greatLearning = new GreatLearning();
		greatLearning.setCourseName("Designing microservices with Spring Boot");
		greatLearning.setCourseType("Information Technology");
		greatLearning.setInstructorName("Vilas More");
		System.out.println("Great Learning "+ greatLearning);
//		greatLearning.setCourseName("Designing Microservices with Spring Boot");
//		greatLearning.setCourseType("Information Technology");
//		greatLearning.setInstructorName("Vilas More");
//		System.out.println("Great Learning Object" + greatLearning);
//		System.out.println("Get method for Couse Name " + greatLearning.getCourseName());
//		System.out.println("Get course type "+ greatLearning.getCourseType());
//		System.out.println("Get Instructor Name "+greatLearning.getInstructorName());
//        GreatLearning greatLearning = new GreatLearning("Designing Microservices with Spring Boot",
//        		"Information Technology","Vilas More");
//        System.out.println("Great Learning object created using all args constructor: "+greatLearning);
	}

}
