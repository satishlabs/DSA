package com.satishlabs.numbersandloops;

//23) WAP to find whether given number is strong or not. 

public class Lab23 {
	public static void main(String[] args) {
		int num = 145;
		int sum = 0;
		int numCopy = num;
		while (num != 0) {
			int digit = num % 10;
			sum = sum + factorial(digit);
			num = num / 10;
		}

		if (sum == numCopy)
			System.out.println(numCopy + " is Strong number");
		else
			System.out.println(numCopy + " is Not Strong number");
	}

	private static int factorial(int num) {
		int fact = 1;
		for (int i = 2; i <= num; i++) {
			fact = fact * i;
		}
		return fact;
	}

}
