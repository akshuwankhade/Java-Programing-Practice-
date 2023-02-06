package com.RnT;

import java.util.Scanner;

public class DemoProg {
	
	public static void main(String[] args) {
		
		String name="Rahul";
		int leng=name.length();
		String rev="";
		
		for(int i=leng-1; i>=0; i--) {
			rev=rev+name.charAt(i);
			//System.out.println(rev);
			}
		System.out.println(rev);
		if(name.equals(rev)) {
			System.out.println("Its palindrom String: ");
		}
		else {
			System.out.println("Not palindrome string: ");
		}
	}

}
