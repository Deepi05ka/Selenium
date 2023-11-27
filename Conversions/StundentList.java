package com.Conversions;

import java.util.ArrayList;
import java.util.List;

public class StundentList {
	
	public static void Test(){
		List<Student>ref = new ArrayList<Student>();
		ref.add(new Student(1,"a","aa"));
		ref.add(new Student(2,"b","bb"));
		ref.add(new Student(3,"c","cc"));
		for(Student stu : ref){
			System.out.println(stu.id+" "+stu.name+" "+stu.address);
		}
	}


	public static void main(String[] args) {
		Test();

	}

}
