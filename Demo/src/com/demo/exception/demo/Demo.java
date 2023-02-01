package com.demo.exception.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;

public class Demo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File  f1=new File("C:\\Users\\Mahi\\Desktop\\Super30\\CoreJava1.java");
		FileInputStream fileInputStream=null;
		try {
			fileInputStream=new FileInputStream(f1);
			System.out.println("File found");
			String string=null;
			System.out.println(string.charAt(0));

		} catch (FileNotFoundException e) {

			System.out.println("File not found");
		}
		catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("nullpointer exception");
		}
		finally {
			fileInputStream.close();
			System.out.println("File close");
		}

	}
}
