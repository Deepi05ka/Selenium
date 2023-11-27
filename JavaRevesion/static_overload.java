package com.JavaRevesion;

public class static_overload {
	static void m1(){
		System.out.println("m1");
	}
	static void m1(int b ){
		System.out.println(b);
	}
	public static void main(String[] args) {
		m1(3);
		m1();
        
	}

}
