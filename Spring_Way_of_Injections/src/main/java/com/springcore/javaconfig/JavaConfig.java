package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages="com.springcore.javaconfig")     // Now we remove @Component("firstStudent") and @ComponentScan(basePackages="com.springcore.javaconfig") and add @Bean in JavaConfig
public class JavaConfig {
	
	@Bean
	public Samosa getSamosa() {
		return new Samosa();
	}

	@Bean
	public Student getStudent() {
		//Create new student object
		Student student = new Student(getSamosa());
		return student;
	}
}
