package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereotype/StereoConfig.xml");
		
		Student student1 = context.getBean("obj", Student.class);
//		Student student1 = context.getBean("student", Student.class);
		
		System.out.println(student1);
		System.out.println(student1.hashCode());
//		System.out.println(student1.getAddresses());
		
// Spring Bean Scope by @Scope("prototype") - Singleton / Prototype
		Student student2 = context.getBean("obj", Student.class);
		System.out.println(student2);
		System.out.println(student2.hashCode());
		
		System.out.println("**********************************************************************************");
		
		Teacher teacher1 = context.getBean("teacher1" , Teacher.class);
		System.out.println(teacher1.hashCode());
		
		Teacher teacher2 = context.getBean("teacher1" , Teacher.class);
		System.out.println(teacher2.hashCode());
	}

}


//we get same hashcode/memoryLocation of both object
//After using @Scope("prototype") we get two different HashCode for different object 
