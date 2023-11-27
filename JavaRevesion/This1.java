package com.JavaRevesion;

public class This1 {
	public void m1() {
		System.out.println("m1");
	}
	public void m2() {
		//this.m1();
		This1 obj = new This1();
		obj.m1();
		// m1();
		System.out.println("m2");
	}
	

	public static void main(String[] args) {
		This1 obj = new This1();
		obj.m2();
		
		
	}

}
