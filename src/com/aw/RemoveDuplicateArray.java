package com.aw;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicateArray {

	public static void main(String[] args) {
		
		//Approach=1
		int arr[]= {10,20,30,20,40,10};
		
		int leng=arr.length;
		
		for(int i=0; i<leng; i++) {
			
			for(int j=i+1; j<leng; j++) {
				
				if(arr[i]==arr[j]) {
					System.out.println(" " +arr[i]);
				}
			}
			
		}
		
		//Approach=2
		ArrayList<Integer> num=new ArrayList<>(Arrays.asList(1,2,3,4,5,5,4,3,2,1));
		
		LinkedHashSet<Integer> lhs=new LinkedHashSet<>(num);
		
		ArrayList<Integer> numlist=new ArrayList<>(lhs);
		System.out.println(numlist);
	}

}
