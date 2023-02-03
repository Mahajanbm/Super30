package com.collection.demo.example;

import java.util.Stack;

public class DemoStack {

	public static void main(String[] args) {
		Stack<String> s2=new Stack<>();
		s2.push("mit");
		s2.push("pune");
		s2.push("Mumbai");
		s2.push("Delhi");
		s2.push("Hyd");
		s2.pop();
		System.out.println(s2);
		for(String s:s2)
		{
			System.out.println(s);
		}
	}

}
