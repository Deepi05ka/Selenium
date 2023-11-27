package com.JavaRevesion;

public class Constructor_Ex  {
	public Constructor_Ex(){
		System.out.println("Constructor");
		
	}
	{
		System.out.println("Instance");
	}
    static {
    	System.out.println("static");
    }
    public void m(){
    	System.out.println("method");
    	
    }
	public static void main(String[] args) {
		new Constructor_Ex().m();;

	}

}
