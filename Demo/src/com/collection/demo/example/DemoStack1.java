package com.collection.demo.example;

import java.util.Stack;
import java.util.concurrent.ConcurrentSkipListSet;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class DemoStack1 {

	public static void main(String[] args) {
		Stack< Employee> s1=new Stack<>();
		Employee e1=new Employee(101,"bob",4545.21f,"bob@gmail.com");
		Employee e2=new Employee();
		e2.setId(102);
		e2.setName("joe");
		e2.setSalary(15456.3f);
		e2.setMailId("joe@gmail.com");
		s1.push(e1);
		s1.push(e2);
		for(Employee e:s1)
		{
			System.out.println(e);
		}
	}

}
