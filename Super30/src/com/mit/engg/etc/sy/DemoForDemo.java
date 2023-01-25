package com.mit.engg.etc.sy;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class DemoForDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int j;
		for( int i=1;i<=5;i++)
		{

			for(  j=4;j>=i;j--)
			{
				System.out.print(" ");
			}

			for(int m=1;m<=i;m++)
			{
				System.out.print(j);
			}
			System.out.println();

		}
	}

}
