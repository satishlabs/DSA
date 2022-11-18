package com.satishlabs.numbersandloops;

//14) WAP to find whether given number is perfect or not.

public class Lab14 {
	public static void main(String[] args) {
		int sum = 0;
		int num = 6; // given number
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0)// i is having each number , (1,2,3=6)
				sum = sum + i;
		}
		if (sum == num)
			System.out.println(num + " is Perfect Number");
		else
			System.out.println(num + " is Not Perfect Number");
	}

}
