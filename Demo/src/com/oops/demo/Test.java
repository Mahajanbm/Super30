package com.oops.demo;

public class Test {

	public static void main(String[] args) {
		Employee e1=new Employee();

		//e1.getData(101,"mahajan");
		//e1.displayData();

		e1.seteId(10);
		e1.seteName("mahajan");
		e1.seteCity("hyd");
		System.out.println(e1.geteId());
		System.out.println(e1.geteName());
		System.out.println(e1.geteCity());
	}

}
