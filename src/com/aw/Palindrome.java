package com.aw;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {
		
		System.out.print("Enter a number: ");
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		
		try {
			int temp=no;
			int rev = 0, rem;
			
			while (temp!=0) {
				
				rem=temp%10;
				rev=rev*10+rem;
				temp=temp/10;
			}
			if(no==rev) {
				System.out.println(no+" Is palindrome number");
			}
			else {
				System.out.println(no+" Is not palindrome number");
			}
		}
			catch (Exception e) {
				System.out.println(e);
			}
			
			finally {
				System.out.println("Finally output Done");
				sc.close();
		}
	}
	
}
