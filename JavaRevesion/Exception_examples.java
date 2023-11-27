package com.JavaRevesion;

import javax.naming.InvalidNameException;

public class Exception_examples {
	 public Exception_examples() throws InvalidNameException{
		 String s ="a";
		 if( (s.contains("1"))||(s.contains("2")) ){
			 System.out.println("Valid");
		 }
		 else {
			 throw new InvalidNameException("string contains only chars");
		 }
	 }

	public static void main(String[] args) throws InvalidNameException {
	 new Exception_examples ();
	 new Exception_examples ();
	 new Exception_examples ();
	 

	}

}
