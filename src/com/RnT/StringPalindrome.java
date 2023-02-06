package com.RnT;

import java.util.Scanner;

// WAP to check if the string is palindrome OR not? 

public class StringPalindrome {
	
	public static void main(String[] args) {
		
		/*System.out.print("Enter a string name: ");
		Scanner sc=new Scanner(System.in);
		String name=sc.next();*/
		
		String name="Madam";
		int leng=name.length();
		String rev="";
		
		for(int i=name.length()-1; i>=0; i--) {
			rev=rev+name.charAt(i);
		}
		System.out.println(rev);

		if(name.equals(rev)) {
			System.out.println("Palindrome String");
		}
		else {
			System.out.println("Not a palindrome string");
		}
	}

}
