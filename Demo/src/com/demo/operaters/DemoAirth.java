package com.demo.operaters;

public class DemoAirth {
	
	int a ,b,Result;
	
	void getData(int a,int b)
	{
		this.a=a;
		this.b=b;
		
	}
	void add()
	{
		Result=a+b;
		System.out.println("Addition is "+Result);
	}
	void sub()
	{
		Result=a-b;
		System.out.println("Substraction is "+Result);
	}
	void mul()
	{
		Result=a*b;
		System.out.println("Multiplication is "+Result);
	}
	void div()
	{
		Result=a/b;
		System.out.println("Division is "+Result);
	}

}
