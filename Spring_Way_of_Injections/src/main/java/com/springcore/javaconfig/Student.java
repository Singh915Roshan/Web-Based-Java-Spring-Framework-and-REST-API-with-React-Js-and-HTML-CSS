package com.springcore.javaconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

//@Component("firstStudent")        // Now we remove @Component("firstStudent") and @ComponentScan(basePackages="com.springcore.javaconfig") and add @Bean in JavaConfig
public class Student {
	
	private Samosa samosa;
	
	
	public Samosa getSamosa() {
		return samosa;
	}

	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}

	public Student(Samosa samosa) {
		this.samosa = samosa;
	}
	
	public void study()
	{
		this.samosa.display();
		System.out.println("Student is reading book...");
	}
}
