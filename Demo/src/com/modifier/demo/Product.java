package com.modifier.demo;

public class Product {
	protected int pId;

	protected void getData()
	{
		System.out.println("hello");
	}
	public static void main(String[] args) {
		Product p1=new Product();
		p1.getData();
		System.out.println(p1.pId=10);
	}
}
