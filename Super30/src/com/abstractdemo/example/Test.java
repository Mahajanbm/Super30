package com.abstractdemo.example;

public class Test {

	public static void main(String[] args) {
		//	Child  c1=new Child();
		//	c1.demo();
		Parent p1=new Child();
		p1.demo();
		Parent.demo1();
		Child1 child1=new Child1();
		I1.demo2();
		I1 i=new Child1();
		I2 i2=new Child1();
		i2.demo4();
		i.demo3();
		i.demo();


	}

}
