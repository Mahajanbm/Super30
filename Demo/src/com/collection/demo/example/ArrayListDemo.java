package com.collection.demo.example;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList aList=new ArrayList();//
		//ArrayListDemo a1=new ArrayListDemo()
		aList.add(10);
		aList.add("Pune");
		aList.add(true);
		aList.add(null);
		aList.add(545.5f);
		aList.add("jhgsd");
		aList.add(10);
		System.out.println(aList.size());
		System.out.println(aList);

		System.out.println(aList.get(2));

		ArrayList<String> al=new ArrayList<>();
		al.add("pune");
		al.add("MIT");
		al.add("Alandi");
		al.add(null);
		al.add("pune");
		System.out.println(al);


		ArrayList<Integer> i1=new ArrayList<>();
		i1.add(55);
		i1.add(44);
		i1.add(99);
		i1.add(84);
		i1.add(84);
		System.out.println(i1);
		System.out.println(i1.contains(555));
		i1.set(0, 12345);
		System.out.println(i1);
		System.out.println("Iterator example");
		Iterator<Integer> iterator=i1.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}

	}

}
