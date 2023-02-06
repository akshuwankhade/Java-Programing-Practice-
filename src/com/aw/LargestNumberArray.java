package com.aw;

//11. Find largest number from array

public class LargestNumberArray {

	public static void main(String[] args) {
		
		int a[]= {2,6,4,12,10,1};
		
		int max=a[0];
		
		for(int i=1; i<a.length;i++) {
			
			if(max<a[i]) {
				
				max=a[i];
			}
			
		}
		System.out.println("largest Array number: "+max);
	}
	
}
