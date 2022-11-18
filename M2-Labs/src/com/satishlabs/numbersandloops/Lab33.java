package com.satishlabs.numbersandloops;

/* 
33) WAP to evaluate following series. 
1-2/x+3/x2- 4/x3+ 5/x4-6/x5 
 
 x = 1 => 1-2/x+3/x2 => 1 - 2 + 3 => 2 
 x = 2 => 1-2/x+3/x2 => 1 - 1 + 3/4 => 0.75 


1 	2  3	4	  5
-- - --+-- - -- + --
x^0	x^1	x^2 x^3	  x^4	
 

 */

public class Lab33 {
	public static void main(String[] args) {
		int n = 3; // Number of values Required in Series
		int x = 1;
		double sum = 0.0;
		int sign = 1;

		for (int i = 1; i <= n; i++) {
			sum = sum + sign * (i / power(x, i - 1));
			sign = sign * -1;
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
