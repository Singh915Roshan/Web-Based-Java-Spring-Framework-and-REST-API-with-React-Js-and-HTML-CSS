package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		        
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/collections/CollectionConfig.xml");

        Emp emp1 = (Emp) context.getBean("Emp1");
        
        System.out.println(emp1.getName());
        System.out.println(emp1.getPhones());
        System.out.println(emp1.getAddresses());
        System.out.println(emp1.getCourses());
        System.out.println(emp1.getPattarn());
	}
}


//Radha
//[123, 1234, 1235, 12367]
//[Wardha, Nagpur, Pune, Mumbai]
//{Course1=Java, Course2=Python, Course3=HTML}
//{name=Kritesh}

// check properties it can not print well.