package com.demo.exception.demo;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.AbstractAction;

public class Client {

	public static void main(String[] args) {
		int a, b,c;

		Scanner s1=new Scanner(System.in);
		try {
			System.out.println("Enter 1 St number");
			a=s1.nextInt();
			System.out.println("Enter 2nd number");

			b=s1.nextInt();

			c=a/b;
			System.out.println("Result is: "+c);

		}
		catch (InputMismatchException e) {

			System.out.println("Enter integer kind of data only");
			// TODO: handle exception
		}
		catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("enter second number greater than 0 ");
		}
		catch (Exception e) {
			// TODO: handle exception

			System.out.println("Error in the code");

		}

	}

}
