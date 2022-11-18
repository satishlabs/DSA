package com.satishlabs.numbersandloops;

/* 
34) WAP to evaluate following series. 
1/(x-1)! + x/x! + x2/(x+1)! + x3/(x+2)! + x4/(x+3)! 

x^0

 
 x = 1 => 1+1+1/2 => 2.5 
 x = 2 => 1+1+4/6= > 2.66 
 */

public class Lab34 {
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
