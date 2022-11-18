package com.satishlabs.numbersandloops;

//5. WAP to Print the Numbers Divisible by 5 from 1 to N. 


public class Lab5 {
	public static void main(String[] args) {
		int n = 20;
		for (int i = 1; i <= n; i++) {
			if (i % 5 == 0)
				System.out.println(i);
		}
	}
}
