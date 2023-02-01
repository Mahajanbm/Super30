package com.abstractdemo.example;

public class Employee {
	 int a;
	void getData() {
		System.out.println("getdata Method with zero parameter");
	}
	void getData(int a) {
		this.a=a;
		System.out.println("getdata Method with int parameter:  "+a);
	}
	void getData(float a) {
		System.out.println("getdata Method with float parameter");
	}
	void getData(int a,float b) {
		System.out.println("getdata Method with int float parameter");
	}
	void getData(float a,int b) {
		System.out.println("getdata Method with int float parameter");
	}
}
