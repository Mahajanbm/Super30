package com.collection.demo.example;

import java.util.ArrayList;
import java.util.ListIterator;

public class Demo {

	public static void main(String[] args) {
		ArrayList al=new ArrayList<>();
		System.out.println(al.size());
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		//System.out.println(al.size());
		al.add(50);
		al.add(60);
		//System.out.println(al.size());
		//al.remove(0);
		//System.out.println(al.size());
		System.out.println(al);
		
		ListIterator  l1=al.listIterator();
		while(l1.hasNext())
		{
			System.out.println(l1.next());
		}
		System.out.println("Reverse order");
		while(l1.hasPrevious())
		{
			System.out.println(l1.previous());
		}
	}

}
