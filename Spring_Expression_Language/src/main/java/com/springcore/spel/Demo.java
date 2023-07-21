package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {

	@Value("#{22+33}")
	private int x;
	@Value("#{1+5+45+34}")
	private int y;
	
	@Value("#{T(java.lang.Math).sqrt(25)}")       	// Spring Expression Language  : How to invoke Static Method, Variable & Creating Object
	private double z;                             	// Static Method
	
	@Value("#{T(java.lang.Math).E}")				// Static Variable  e=2.718281828459045
	private double e;
	@Value("#{T(java.lang.Math).PI}")				// Static Variable  pi=3.141592653589793
	private double pi;
	
	@Value("#{new java.lang.String('Ashish Balpande')}")	//Create Static Object
	private String name;
	
	@Value("#{8>3}")  								// Boolean Type SpEL
	private boolean isActive;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public double getE() {
		return e;
	}

	public void setE(double e) {
		this.e = e;
	}

	public double getPi() {
		return pi;
	}

	public void setPi(double pi) {
		this.pi = pi;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	
	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + ", pi=" + pi + ", name=" + name + ", isActive="
				+ isActive + "]";
	}
	



	
}
