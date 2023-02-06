package com.RnT;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		// Declare any Array 
		int[] ar = {15,17,8,25,9,30};                    
		Scanner sc = new Scanner(System.in);
		// Enter position of element
		System.out.print("Enter nth position of element: ");
		int pos = sc.nextInt();
		// Check user given position is valid or not
		if(pos <= ar.length){
			// Get particular element
			int element = ar[pos-1];
			System.out.println(pos + " th element of given Array is "+ element);
		}                     
		else {
			System.out.println("Invalid Position! Please enter position upto " + ar.length);
	   }

	}
}
