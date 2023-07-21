package com.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aop.services.PaymentService;
import com.aop.services.PaymentServiceImpl;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext context = new ClassPathXmlApplicationContext("com/aop/Config.xml");
        PaymentService paymentService = context.getBean("payment", PaymentService.class);
        
        //auth / print : payment started
        paymentService.makePayment(500);
    }
}
