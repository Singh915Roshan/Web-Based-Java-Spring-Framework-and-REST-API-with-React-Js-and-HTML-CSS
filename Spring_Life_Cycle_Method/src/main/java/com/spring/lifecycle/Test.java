package com.spring.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public abstract class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/lifecycle/LcConfig.xml");
//		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/spring/lifecycle/LcConfig.xml");

		//
		
//		Samosa samosa1 = (Samosa) context.getBean("samosa1");
//		System.out.println(samosa1);
//		
//		((AbstractApplicationContext) context).registerShutdownHook();  //This statement call destroy() method.
//								//if you don't want typecast then above "ApplicationContext" change to "AbstractApplicationContext"
		
		//
		
//		Pepsi pepsi1 = (Pepsi) context.getBean("pepsi1");
//		System.out.println(pepsi1);
//		((AbstractApplicationContext) context).registerShutdownHook();
		
		//
		
		Example ex1 = (Example) context.getBean("example1");
		System.out.println(ex1);
		((AbstractApplicationContext) context).registerShutdownHook();
	}

}
