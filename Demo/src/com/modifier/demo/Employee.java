package com.modifier.demo;

public class Employee {
	private int a;

	public Employee() {
		// TODO Auto-generated constructor stub
	}
	private void  demo()
	{
		System.out.println(a);
	}
	public static void main(String[] args) {
		Employee e1=new Employee();
		System.out.println(e1.a);
		e1.demo();
	}
}
