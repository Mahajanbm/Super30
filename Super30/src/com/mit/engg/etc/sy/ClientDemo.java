package com.mit.engg.etc.sy;

import java.util.Scanner;

public class ClientDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,a,b;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter value of a");
		a=s1.nextInt();
		System.out.println("Enter value of b");
		b=s1.nextInt();
		for(i=1;i<=a;i++)
		{
			
			for(j=1;j<=b;j++)//6
			{
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
