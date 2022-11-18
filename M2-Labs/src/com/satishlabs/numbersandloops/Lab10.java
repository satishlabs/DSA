package com.satishlabs.numbersandloops;

//10) WAP to find sum of numbers from 1 to n.

public class Lab10 {
	public static void main(String[] args) {
		int sum = 0;
		int n = 5; // 1,2,3,4,5
		for (int i = 0; i <= n; i++) {
			sum = sum + i;
		}
		System.out.println(sum); // 15

	}

}
