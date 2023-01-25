package com.mit.engg.etc.sy;

public class Product {
	int productId;
	String productName;
	float productPrice;
	void getDetails(int productId,String productName,float productPrice)
	{
		this.productId=productId;
		this.productName=productName;
		this.productPrice=productPrice;
	}
	void displayProductDetails()
	{
		System.out.println("Product Id Is: "+productId);
		System.out.println("Product name Is: "+productName);
		System.out.println("Product price Is: "+productPrice);
	}




}
