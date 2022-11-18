package com.satishlabs.numbersandloops;

//8. WAP to Find whether given Number is Prime or Not. 

public class Lab8 {
	public static void main(String[] args) {
		int n = 13;
		int count = 0;
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				count++;
				break;
			}
		}
		if (count == 0) {
			System.out.println(n + " is Prime");
		} else {
			System.out.println(n + " is Not Prime");
		}

	}
}
