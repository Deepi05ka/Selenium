package com.JavaRevesion;

public class Variable2 {
	Variables obj = new Variables();
	public static void login2(){
		 System.out.println("Login two");
	 }
	 public static void logout(){
		 System.out.println("logout");
	 }
	public static void main(String[] args) {
		Variable2 obj2 = new Variable2();
		Variables obj = new Variables();
		obj2.login2();
		obj2.logout();
		obj.login();
		obj.search();
		

	}

}
