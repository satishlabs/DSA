package com.satishlabs.numbersandloops;

//21) WAP to find the Factorial of given Number. 

public class Lab21 {
	public static void main(String[] args) {
		int fact = 1;
		int num = 5;
		for (int i = 2; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial is: " + fact);
	}

}
