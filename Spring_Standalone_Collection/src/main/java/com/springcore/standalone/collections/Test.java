package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/standalone/collections/AloneConfig.xml");
		
		Person person1 = context.getBean("person1", Person.class);
		System.out.println(person1);
		System.out.println(person1.getFriends().getClass().getName());
		
		Person person2 = context.getBean("person2", Person.class);
		System.out.println(person2);
	}

}


//Person [friends=[Prince, Ashish, Kritesh, Nishant]]
//java.util.LinkedList