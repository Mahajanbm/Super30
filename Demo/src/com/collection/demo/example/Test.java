package com.collection.demo.example;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {55,66,88,99,77};
		int [] b=new int[5];
		int [] c=new int[10];
		a=c;
		b[0]=10;
		
		b[1]=20;
		b[2]=30;
		b[3]=40;
		b[4]=50;
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);
		System.out.println(b[3]);
		System.out.println(b[4]);
		
		Object [] obj=new Object[5];
		
		obj[0]=102;
		obj[1]="MIT";
		obj[2]=true;
		obj[3]=155.5f;
		obj[4]='m';
		obj[5]='p';
		
	}

}
