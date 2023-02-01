package com.abstractdemo.example;

public  interface I1 {

	 void demo(); 
	 static void demo2() {
		 System.out.println("Demo2 method");
	 }
	 default void demo3() {
		 System.out.println("Demo3 method");
	 }
}
