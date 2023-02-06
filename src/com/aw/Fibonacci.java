package com.aw;

// Previous two number of addition-->0,1,1,2,3,5,8,13,21......

public class Fibonacci {
	
	public static void main(String[] args) {
		
		int a=0;
		int b=1;
		int c;
		System.out.print("Fibonacci number:- ");
		
		for(int i=1; i<=10; i++) {
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
	}
}