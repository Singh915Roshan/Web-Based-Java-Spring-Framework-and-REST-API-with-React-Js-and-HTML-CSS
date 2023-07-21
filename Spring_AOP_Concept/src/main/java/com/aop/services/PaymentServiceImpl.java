package com.aop.services;

public class PaymentServiceImpl implements PaymentService{

	public void makePayment(int amount) {
		System.out.println("Amount Debited... Rs."+amount);
		// Other code
		System.out.println("Amount Credited... Rs."+amount);
	}

}
