package com.JavaRevesion;

import java.util.ArrayList;
import java.util.List;

public class S2 {
	public static void f1(){
		List<S1> ref =new ArrayList<>();
		 S1 obj = new S1(1,"aa","nn");
		 S1 obj1 = new S1(2,"bb","cc"); 
		 S1 obj2 = new S1(3,"ee","ee");
		
		ref.add(new S1(11,"aaa","nn"));
	    ref.add(obj1);
		ref.add(obj2);
	
	for(S1 ss : ref){
		System.out.print(ss.address+" " + ss.id+" " +ss.name);
	}
	}
	public static void main(String[] args) {
		f1();
          
	}

}
