package com.aw;

//Write a Java Program to swap two numbers with using the third variable.

public class SwappingTwoNum {

	public static void main(String[] args) {
		
		int a=10, b=20;
		/*System.out.println("Before swapping values: "+a+" "+b);
		
		int temp=a;
			a=b;
			b=temp;
			
		System.out.println("After swapping values: "+a+" "+b);
		*/
		
		// Write a Java Program to swap two numbers without using the third variable.
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping values: "+a+" "+b);
		
	}

}
