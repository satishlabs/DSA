package com.satishlabs.numbersandloops;
/* 
29A) WAP to print the fibonocii series. 
0 1 1 2 3 5 8 13 
*/

public class Lab29A {
	public static void main(String[] args) {
		int n = 5; // Number of values Required in Series
		if (n < 2) {
			System.out.println("Invalid Input");
		} else {
			int firstNum = 0;
			int secondNum = 1;
			System.out.print(firstNum + "\t" + secondNum);
			int nextNum = 0;
			for (int i = 1; i <= n - 2; i++) {
				nextNum = firstNum + secondNum;
				System.out.print("\t" + nextNum);
				firstNum = secondNum;
				secondNum = nextNum;
			}
		}
	}

}
