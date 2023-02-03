package com.collection.demo.example;

import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		int n;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter Size Of array");
		n=s1.nextInt();
		int a[]=new int[n];
		System.out.println("Enter Array Element ");
		for( int i=0;i<a.length;i++)
		{
			a[i]=s1.nextInt();
		}

		System.out.println(" Array Element are ");
		for( int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}
