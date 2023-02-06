package com.aw;

public class Even_Odd {
	
	public static void main(String[] args) {
		
		// Print even number using do while loop. 
		
		int i=4;
		System.out.println("Print even number: ");
		
		do {
			if(i%2==0)
			{
				System.out.println(i);
			}
			//System.out.println(i);
			
			i++;		
		} 
		while (i<=100);
		
		// Approch=2
		/*int a=3;
		if(a%2==0) {
			System.out.println("Print even num");
		}
		else {
			System.out.println("Print odd num");
		}*/
	}
	

}
