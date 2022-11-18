package com.satishlabs.numbersandloops;

/* 
30) WAP to print the following series. 
1 1 6 4 11 9 16 16 21 25 

first:1 6 11 16 21
second:1 4 9 16 25

combined:both and print
*/

public class Lab30 {
	public static void main(String[] args) {
		int n=10; //Number of values Required in Series
		
		//Input - Only Even Numbers
		
		int a=1;
		int b=1;
		
		for(int i=1; i<=n/2;i++) {
			System.out.print(a+"\t"+b+"\t");
			a=a+5;
			b=(i+1)*(i+1);
		}
	}

}
