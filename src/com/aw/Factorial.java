package com.aw;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		/*System.out.print("Enter a Number: ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();*/
		int num=5;
		int fact=1;
		for(int i=1; i<=num;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial: "+fact);

	}

}
