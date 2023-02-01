package com.oops.demo;

public class Ecommerce {
	int productId;
	String productName;
	float productPrice;
	String productDesc;
	String manufa;
	public Ecommerce() {
	System.out.println("constructor");
	}
	static {
		System.out.println("Hello Static block");
	}
	{
		System.out.println("Hello non-Static block");
	}
	public void demo()
	{

	}
}
