package com.demo.exception.demo;

public class Test {

	public static void main(String[] args) {
		String str= null;
		try {
			System.out.println(str.charAt(0));
		}
		
	
		catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("Please enter String string data only");
		}
		
		
		catch (ArithmeticException e) {
			// TODO: handle exception
		}
		catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}

}
