package com.demo.exception.demo;

public class TestDemo {

	public static void main(String[] args) {
		try {
			
			System.out.println("Hello");
			throw new UserDefine();
		} catch (UserDefine e) {
			// TODO: handle exception
		}
		catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
		}
	}

}
