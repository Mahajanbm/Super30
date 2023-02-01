package com.demo.exception.demo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		int a,b, c;
		String str=null;
		int[] d= {10,20,30,40};

		try {
			System.out.println("Outer try block");
			Scanner s1=new Scanner(System.in);
			System.out.println("Enter 1st number");
			a=s1.nextInt();
			System.out.println("Enter 1st number");
			b=s1.nextInt();
			c=a/b;
			System.out.println(c);
			try {
				System.out.println("inner try block");
				System.out.println(d[2]);

				try {
					System.out.println("inner inner try block");
					System.out.println(str.charAt(0));
				} catch (NullPointerException e) {
					
					System.out.println("nested catch block");
					System.out.println("null pointer exception");
				}
				finally {
					System.out.println("nested finally");
				}
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("inner Catch block");
				System.out.println("Array index out of bound exception");
			}finally {
				System.out.println("inner finally");
			}

		} catch (InputMismatchException e) {
			
			System.out.println("Outer Catch block");
			System.out.println("please enter integer data only");
		}
		 catch (ArithmeticException e) {
				
				System.out.println("Outer Catch block");
				System.out.println("Divide by zero exception");
			}
		finally {
			System.out.println("outer finally");
		}
	}


}


