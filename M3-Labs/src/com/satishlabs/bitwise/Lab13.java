package com.satishlabs.bitwise;

//Find Whether given Number is Power of 2 or Not
//Number of Set Bits are 1
public class Lab13 {
	public static void main(String[] args) {
		int n = 40;
		int count = 0;
		while (n > 0) {
			n = n & (n - 1);
			count++;
		}

		System.out.println("Set Bit count: " + count);
		if (count == 1)
			System.out.println("2 Power");
		else
			System.out.println("Not 2 Power");
	}
}
