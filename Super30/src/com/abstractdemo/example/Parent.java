package com.abstractdemo.example;

import java.beans.DefaultPersistenceDelegate;
import java.util.spi.AbstractResourceBundleProvider;

public abstract class Parent { 
	public Parent() {
		System.out.println("Abstract Class Constructor");
	}
	public void display()
	{
		System.out.println("this  is display method");
	}
	abstract void demo(); 
	public static void demo1() {
		System.out.println("Static method");
	}

	


}
