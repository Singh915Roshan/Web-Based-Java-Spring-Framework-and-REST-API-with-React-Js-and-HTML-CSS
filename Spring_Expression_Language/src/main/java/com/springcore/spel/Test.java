package com.springcore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/spel/SpelConfig.xml");
		
//Spring Expression Language
		Demo demo1 = context.getBean("demo", Demo.class);
		System.out.println(demo1);
		
		System.out.println("******************************************");
		
		//Below Expression type is not use more, its for learning
		SpelExpressionParser temp = new SpelExpressionParser();
		Expression expression = temp.parseExpression("22+44");
		System.out.println("22 + 44 = " + expression.getValue());
	}

}
