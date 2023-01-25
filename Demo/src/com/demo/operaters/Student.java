package com.demo.operaters;

import java.util.Scanner;

import javax.net.ssl.SNIHostName;

public class Student {
int sId;
String sName;
int s1,s2,s3,s4;
float marks;
float per;
Scanner s=new Scanner(System.in);
 void getStudentDetials()
 {
	   
	 System.out.println("Enter Student marks");
	 s1=s.nextInt();
	 s2=s.nextInt();
	 s3=s.nextInt();
	 s4=s.nextInt();
	 
	 marks=s1+s2+s3+s4;
	 per=(marks/400)*100;
	
	 if(per>65)
	 {
		 System.out.println("Distnction");
	 }
	 else if(per>=60 && per<65) {
		System.out.println("First class");
	}
	 else if (per>=55 && per<60) {
		 System.out.println("Higher Second class");
		
	}
	 else if (per>=50 && per<55) {
		System.out.println("Second class");
	}
	 else if (per >=40 && per<50) {
		System.out.println("Pass");
	}
	 else {
		System.out.println("fail");
	}
	 
 }


}
