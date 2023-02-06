package com.aw;

import java.util.Scanner;

//Reverse a number.
public class ReverseNumber {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int no=sc.nextInt();
		
		//Approch=1
		int rev=0,rem;
		while(no!=0) {
			rem=no%10;	//3
			rev=rev*10+rem; //3
			no=no/10;
			//System.out.println("divided no "+no);
		}
		System.out.println(rev);
		
		// Approch=2

		//StringBuffer sb=new StringBuffer(String.valueOf(no));
		//System.out.println("Reverse number: "+sb.reverse());
		
		// Approch=3
		
		//StringBuilder sb=new StringBuilder();
		//StringBuilder rev=sb.append(no).reverse();
		//System.out.println(rev);
	
		
	}

}
