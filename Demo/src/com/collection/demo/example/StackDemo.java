package com.collection.demo.example;

import java.util.Stack;

public class StackDemo {

	

	public static void main(String[] args) {
		Stack  s1=new Stack<>();
		System.out.println(s1.isEmpty());
		s1.push(10);
		s1.push(50);
		s1.push(60);
		s1.push(88);
		s1.push(100);
		s1.push("pune");
		s1.push("pune");
		System.out.println(s1.isEmpty());
		System.out.println(s1);
		
		s1.pop();
		System.out.println(s1);
		System.out.println(s1.peek());
	}

}
