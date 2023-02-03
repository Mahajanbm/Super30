package com.collection.demo.example;

import java.util.ArrayList;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class TestDemo {

	public static void main(String[] args) {
		ArrayList<Student> al2=new ArrayList<>();
		System.out.println(al2.size());
		ArrayList<Student> aList=new ArrayList<>();
		System.out.println(aList.isEmpty());
		Student s3=new Student(103, "joe", "delhi", "9922114455", "Sale");
		Student s1=new Student();
		s1.setId(101);
		s1.setName("Mahi");
		s1.setCity("Pune");
		s1.setDept("Hr");
		s1.setMobile("543535");
		Student s2=new Student();
		s2.setId(102);
		s2.setName("ajay");
		s2.setCity("Pune");
		s2.setDept("Dev");
		s2.setMobile("68723131");
		aList.add(s1);
		aList.add(s2);
		aList.add(s3);
		//	System.out.println(aList);
		//aList.remove(0);

		System.out.println(aList.contains(s2));
		for(Student s:aList)
		{
			System.out.println(s);
		}

		al2=aList;
		//al2.addAll(aList);
		System.out.println(al2);
		
		System.out.println(al2.size());
		System.out.println();

	}

}
