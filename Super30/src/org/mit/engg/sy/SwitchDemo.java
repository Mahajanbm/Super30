package org.mit.engg.sy;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter Value");
		a=s1.nextInt();
		switch(a)
		{
		
		case 1:
			System.out.println("Entered value is One");
		break;
		case 2:
			System.out.println("value is two");
		break;
		case 3:
			System.out.println("Value is Three");
		break;
		default:
		System.out.println("Wrong data");
		
		
		}
		
		

	}

}
