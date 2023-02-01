package com.demo.exception.demo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ClientDemo {

	public static void main(String[] args) {
		int a;
		try {Scanner s1=new Scanner(System.in);
		System.out.println("Enter number");
		a=s1.nextInt();
		throw new ArithmeticException();
		
		}
		catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Arithemetic exception");
		}
		catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("inputmismatch exception");
		}

		catch (Exception e) {
			// TODO: handle exception
		}

	}

}
