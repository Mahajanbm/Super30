package com.mit.engg.etc.sy;

import java.util.Scanner;

public class Employee {
	int eId;
	String name;
	String city;
	Scanner s1=new Scanner(System.in);
	void getEmployee()
	{
		System.out.println("Enter Employee Id");
		eId=s1.nextInt();
		System.out.println("Enter Employee name");
		name=s1.next();	
		System.out.println("Enter Employee city");
		city=s1.next();

	}

	void display()
	{
		System.out.println("Employee Id is: "+eId);
		System.out.println("Employee Name is:  "+name);
		System.out.println("Employee City is "+city);

	}




}
