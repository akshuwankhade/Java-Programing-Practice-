package com.RnT;

// WAP to print Non_Duplicate Number in the array?

public class NonDuplicate_Array {

	public static void main(String[] args) {
		
		int arr[]= {10,12,14,16,14,16};
		
		for(int i=0; i<arr.length; i++) {
			int count=0;
			for(int j=0; j<arr.length;j++) {
				if(arr[j]==arr[i]) {
					count++;
				}
			}
			if(count==1) {
				System.out.println("Non duplicate number: "+arr[i]);
			}
		}
		
	}
}
