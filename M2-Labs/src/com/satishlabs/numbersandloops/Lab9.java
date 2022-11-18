package com.satishlabs.numbersandloops;

//9) WAP to print the prime numbers between M to N.

public class Lab9 {
	public static void main(String[] args) {
		int m = 1;
		int n=25;
		for(int num=m; num<=n; num++) {
			if(isPrime(num)) {
				System.out.println(num);
			}
		}
		
	}

	private static boolean isPrime(int num) {
		int count = 0;
		boolean primeFlag=false;
		
		for(int i=2; i<=num/2; i++) {
			if(num%i==0) {
				count++;
				break;
			}
		}
		if(count==0) {
			primeFlag = true;
		}
		return primeFlag;
	}
}
