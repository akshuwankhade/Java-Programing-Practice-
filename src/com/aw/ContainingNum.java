package com.aw;

//WAP to print number containing...2

public class ContainingNum {

	public static void main(String[] args) {
		
		int arr[]= {2,22,34,432,5252,11,13,14,82};
		for(int a:arr) {
			String s=Integer.toString(a);
			boolean b=s.contains("1");
			
			if(b)
				System.out.println(a);
		}

	}

}
