package com.modifier.demo;

public class Student {

	int a;
	void demo()

	{
		System.out.println(a);
	}
	public static void main(String[] args) {
		Student s1=new Student();
		System.out.println(s1.a);
		s1.demo();
	}
}
