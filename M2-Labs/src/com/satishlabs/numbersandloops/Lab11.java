package com.satishlabs.numbersandloops;

//11) WAP to find sum of squares of numbers from 1 to n. 

public class Lab11 {
	public static void main(String[] args) {
		int sum = 0;
		int n = 5; 
		for (int i = 1; i <= n; i++) {
			sum = sum + i*i; //i contains each Number
		}
		System.out.println("Sum : "+sum); 

	}

}
