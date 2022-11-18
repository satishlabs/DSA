package com.satishlabs.numbersandloops;

//18A) WAP to find sum of individual digits of given number? 

public class Lab18A {
	public static void main(String[] args) {
		int num = 123;
		int sum = 0;

		for (; num != 0; num = num / 10) {
			int rem = num % 10;
			sum = sum + rem;
		}
		System.out.println("Sum : " + sum);
	}

}
