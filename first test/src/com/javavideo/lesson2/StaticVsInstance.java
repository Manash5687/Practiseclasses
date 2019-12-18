package com.javavideo.lesson2;

public class StaticVsInstance {
	
	int a = 2;	// Inline intialization
	static int b = 3; // Inline 
	int c;
	
	static {
		// Static Initialzer
		b -= 3;
	}
	
	public StaticVsInstance() {
		// Object/Instance initializer
		c += 1;
	}

	
	public static void main(String[] args) {
		
		StaticVsInstance s1 = new StaticVsInstance(); // S1  -> a=2 , a=3, b=3
		StaticVsInstance s2 = new StaticVsInstance(); // S2 -> a=2, b=3
		
		s1.a += 1;
		
		System.out.println(s2.a);
		
		s2.b += 2;
		System.out.println("=>"+s1.b);
		
		StaticVsInstance s3 = s1;
		
		System.out.println(s3.a);
		
		s3.b -= 1;
		
		System.out.println(s1.b);
		System.out.println(s2.b);
		
		
		s3.a += 2;
		System.out.println(s1.a);
		System.out.println(s2.a);
		System.out.println(s3.c);
	}
}
