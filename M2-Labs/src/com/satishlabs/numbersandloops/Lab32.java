package com.satishlabs.numbersandloops;

/* 
32) WAP to evaluate following series. 
1+2/x+3/x2+ 4/x3+ 5/x4+ 

1 	2  3	4	  5
--+ --+-- + -- 	+ --
x^0	x^1	x^2 x^3	  x^4	
 
 x = 1 => 1+2/x+3/x2 => 1 + 2 + 3 => 6 
 x = 2 => 1+2/x+3/x2 => 1 + 1 + 3/4 => 2.75 
 */

public class Lab32 {
	public static void main(String[] args) {
		int n = 3; // Number of values Required in Series
		int x = 2;
		double sum = 0.0;
		for (int i = 0; i <= n; i++) {
			sum = sum + i / power(x, i - 1);
		}
		System.out.println("Sum : " + sum);
	}

	private static double power(int n, int p) {
		double power = 1;
		for (int i = 1; i <= p; i++) {
			power = power * n;
		}
		return power;
	}

}
