package com.JavaRevesion;

public class Methods {
	{
		System.out.println("Instance Block");
	}
	{
		System.out.println("Block 2");
	}
	static {
		new Methods().m1();
		System.out.println("static block");
		
	}
    private void m1(){
    	System.out.println("m1");
    }
	static public void main(String[] args) {
		new Methods();
	}

}
