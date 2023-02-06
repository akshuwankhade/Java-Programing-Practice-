package com.aw;

/*	Example Armstrong Number 
 
 	 			153==> 1 2 3
				1*1*1 + 5*5*5 + 3*3*3
				1 + 125 + 27=153 Armstrong Num;
*/
public class Armstrong {
	public static void main(String[] args) {
		
		
		int n=153;
		int temp=n;
		int rem=0,sum=0;
		
		while(n>0) {
			rem=n%10;
			n=n/10;
			sum=sum+rem*rem*rem;
			
		}
		if(temp==sum)
			System.out.println("Its armstrong number");
		else
			System.out.println("Not armstrong number");
	}
}
