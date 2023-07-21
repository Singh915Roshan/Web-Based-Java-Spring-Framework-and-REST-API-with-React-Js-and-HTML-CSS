package com.spring.lifecycle;

public class Samosa {

	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	
	//We can change init and destroy method name.
	public void init() {
		System.out.println("Inside init() Method");
	}
	
	public void destroy() {
		System.out.println("Inside destroy() Method");
	}
}
