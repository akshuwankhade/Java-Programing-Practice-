package com.RnT;

import java.util.Scanner;

public class Prime {
	
	private static boolean isPrime(int num) {
		/*if (num==1) {
			return false;
		}*/
		for(int i=2; i<num; i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Enter a number ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		int count =1;
		int startNumber=1;
		
		while(count <=num) {
			startNumber++;
			if(Prime.isPrime(startNumber)) {
				System.out.print(startNumber+ " ");
				count++;
			}			
			

		}
	}
	
}
