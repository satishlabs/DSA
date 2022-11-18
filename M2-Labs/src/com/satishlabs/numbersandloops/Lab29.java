package com.satishlabs.numbersandloops;

/* 
29) WAP to print the fibonocii series. 
0 1 1 2 3 5 8 13 
*/ 

public class Lab29 {
	public static void main(String[] args) {
		int n = 6; //Number of values Required in Series
		//Validation Code
		int firstNum=0;
		int secondNum=1;
		
		System.out.print(firstNum+"\t"+secondNum);
		
		int nextNum=0;
		for(int i=3; i<=n;i++) {
			nextNum = firstNum+secondNum;
			System.out.print("\t"+nextNum);
			firstNum = secondNum;
			secondNum = nextNum;
		}
	}

}
