package org.mit.engg.sy;
public class NestedDemo {

	public static void main(String[] args) {
		int a=10,b=20,c=30;

		if(a>b && a>c)
		{
			System.out.println("A is Greater");
		}
		else if(b>a && b>c)
		{
			System.out.println("B is Greater");
		}
		else  if(c>a && c>b){
			System.out.println("C is Greater");

		}
		else {
			System.out.println("All are Equals");
		}

	}

}
