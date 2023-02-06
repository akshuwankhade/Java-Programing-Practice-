package com.aw;
// One OR Itself divisibale 

import java.util.Scanner;

public class PrimeNum {
	
	public static void main(String[] args) {
		
		int no=5;
		int temp=0;
		for(int i=2; i<=no-1; i++) {
			
			if(no%i==0) {
				
				temp=temp+1;
			}
		}
		if(temp>0) {
			System.out.println("Number is not prime");
		}
		else {
			System.out.println("Number is prime");
		}
	
		/*System.out.print("Enter a number: ");
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		
	//int no=7;
	int temp=0;
	int i=1;
	
	while(i<=no) {
		
	//for(int i=2; i<=no-1; i++) 
	//{
		if(no%i==0) 
			temp=temp+1;
			if(temp>2)
				break;
			i++;
		
		
	}
		if(temp==2) 
		{
			System.out.println("Number is prime");
		}
		else
		{
			System.out.println("Not prime number");
		}
		
		
		for(int i=1; i<=100; i++) {
			
			int temp=0;
			
			for(int j=2; j<i; j++) {
				
				if(i%j==0) {
					temp=temp+1;
				}
			}
			if(temp==0) {
				System.out.println(i);
			}
		}*/
		
	}

}
