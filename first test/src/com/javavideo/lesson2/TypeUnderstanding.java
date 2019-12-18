package com.javavideo.lesson2;

public class TypeUnderstanding {

	public static void main(String[] args) {
		
		Student a = new Student();
		Student a1 = new Student();
		
		System.out.println(a.rollNo);
		System.out.println(a.name);
		System.out.println(a.age);
		
		a.age = 15;
		a.academicYear = 2001;
		System.out.println(a1.age);
		System.out.println(a1.academicYear);
	}
}


/**
 * Blueprint for creating Students.
 * 
 *  An Object is an instance of a class.
 *  
 *  There can be 1....n instances for a class.
 *  
 *  Each instance has their own memory space allocated on the healp.
 * 
 * @author manas
 *
 */
class Student {
	
	int rollNo;
	String name;
	float age;
	static int academicYear;
}
