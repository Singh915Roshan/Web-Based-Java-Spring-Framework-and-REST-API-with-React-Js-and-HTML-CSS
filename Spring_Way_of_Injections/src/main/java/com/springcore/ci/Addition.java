package com.springcore.ci;

public class Addition {

	private int a;
	private int b;

//	Here top constructor working, if String Constructor not available
//	If String constructor available at any place, it will working 1st
//	by default String constructor work here

	public Addition(double m, double n) {
		this.a = (int) m;
		this.b = (int) n;
		System.out.println("a: "+a +"  b: "+b);
		System.out.println("Constructor: double, double");
	}

	public Addition(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("a: "+a +"  b: "+b);
		System.out.println("Constructor: int, int");
	}

	public Addition(String m, String n) { 
		this.a =Integer.parseInt(m); 
		this.b =Integer.parseInt(n);
		System.out.println("a: "+a +"  b: "+b);
		System.out.println("Construcor: String, String"); 
	}


	public void doSum() {
		System.out.println("Sum is: " + (this.a + this.b));
	}
}
