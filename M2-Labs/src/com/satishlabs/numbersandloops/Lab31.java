package com.satishlabs.numbersandloops;

/* 
31) WAP to print the following series. 
1 1 3 8 6 27 9 64 12 125 

first: 1,3,6,9,12
second:1,8,27,64,125

*/

public class Lab31 {
	public static void main(String[] args) {
		int n=10; //Number of values Required in Series
		
		//Input - Only Even Numbers
		
		int a=1;
		int b=1;
		
		for(int i=1; i<=n/2;i++) {
			System.out.print(a+"\t"+b+"\t");
			a=i*3;
			b=i+1;
			b=b*b*b;
		}
	}

}
