package com.collection.demo.example;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
public class DemoDemo {

	public static void main(String[] args) {
		Collection c1=new ArrayList<>();
		List l1=new ArrayList<>();
		AbstractList al1=new ArrayList<>();
		ArrayList<Integer> al=new ArrayList<>();
		c1.add(10);
		c1.add(54);
		c1.add("pune");
		c1.add("MIT");
		System.out.println(c1);
		System.out.println(c1.size());
		c1.remove("pune");
		System.out.println(c1.contains("MIT"));
		System.out.println(c1.isEmpty());



		l1.add(15);
		l1.add("Hyd");
		l1.add("mumbai");
		l1.add(412.5f);
		l1.add("Delhi");
		l1.add(true);
		System.out.println("Using For Loop");
		for( int i=0;i<l1.size();i++)
		{
			System.out.println(l1.get(i));
		}

		System.out.println("Absctract Lis Example");
		al1.add(52);
		al1.add("mit");
		al1.add(545);
		al1.add("pune");
		al1.add(1111);
		al1.add(true);
		for(Object obj:al1)
		{
			System.out.println(obj);	
		}

		System.out.println("ArrayList Example");
		al.add(12);
		al.add(55);
		al.add(44);
		al.add(88);
		al.add(99);
		al.add(55);
		for(Integer i:al)
		{
			System.out.println(i);
		}
		
		

	}

}
