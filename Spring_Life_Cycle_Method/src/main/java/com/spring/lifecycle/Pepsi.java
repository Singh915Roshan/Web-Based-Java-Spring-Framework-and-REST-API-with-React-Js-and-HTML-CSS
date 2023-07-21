package com.spring.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean, DisposableBean {

	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Pepsi() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}

	//Implement by InitializingBean
	public void afterPropertiesSet() throws Exception {
		System.out.println("Taking Pepsi : init()");
	}
	
	//Implement by DisposableBean
	public void destroy() throws Exception {
		System.out.println("Going to put Bottal back to shop : destroy()");
	}
}
