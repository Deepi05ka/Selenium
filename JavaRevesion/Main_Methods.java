package com.JavaRevesion;

public class Main_Methods {
	public Main_Methods(){
		System.out.println("constructor");
	}
	
     public static void main(String[] args) {
		System.out.println("main method");
		Main_Methods m = new Main_Methods();
		main("abs");
		main(2);
	}
     public static void main(String args) {
 		System.out.println("overload 1");

 	}
    public static void main(int args) {
 		System.out.println("overload2");

 	}

}
