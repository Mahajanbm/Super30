package com.demo.operaters;

public class Child extends Parent {

	public Child() {
		super(10);
		System.out.println("Child class COnstructor");

	}
	public Child(int a) {
		this();
		
		System.out.println("This is Child class Parameterized Constructor");
	}

}
