package org.mit.engg.sy;

import java.util.Scanner;

public class DemoSwitch {

	public static void main(String[] args) {
String a;
		
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter Value");
		a=s1.next();
		switch(a)
		{
		
		case "Virat":
			System.out.println("I'm Virat");
		break;
		case "Rohit":
			System.out.println("I'm Rohit");
		break;
		case "surya":
			System.out.println("I'm surya");
		break;
		default:
		System.out.println("Wrong data");
		
		
		}

	}

}
