package com.satishlabs.numbersandloops;

//12) WAP to find sum of cubes of numbers from 1 to n. 


public class Lab12 {
	public static void main(String[] args) {
		int sum = 0;
		int n = 3; //1*1*1+2*2*2+3*3*3
		for (int i = 1; i <= n; i++) {
			sum = sum + i*i*i; //i contains each Number
		}
		System.out.println("Sum : "+sum); 

	}

}
