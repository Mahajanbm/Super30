package com.demo.exception.demo;

public class Demo1 {

	public static void main(String[] args) {
	int[] a= {50,60,50,100};
	String str=null;
	
	try {
		System.out.println(a[4]);
		
		try
		{
			
		}
		catch (Exception e) {
			// TODO: handle exception
			try {
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		finally {
			try {
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	} catch (ArrayIndexOutOfBoundsException e) {
		// TODO: handle exception
		System.out.println(" Array size is not match");
	}
	finally {
		
	}

	}

}
