package com.satishlabs.numbersandloops;

//27) WAP to print the Reverse of the given number.

public class Lab27 {
	public static void main(String[] args) {
		int num=123;
		int sum=0;
		while(num!=0) {
			int digit = num%10;
			sum = sum*10+digit;
			num = num/10; //changing the number
		}
		System.out.println("Reverse Number is : "+sum);
	}

}
