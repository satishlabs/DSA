package com.satishlabs.bitwise;

//Count the Number of Set Bits in given number
public class Lab12 {
	public static void main(String[] args) {
		int n = 15;
		int count = 0;
		while (n > 0) {
			if ((n & 1) != 0)
				count++;

			n = n / 2;
		}

		System.out.println("Set Bit count: " + count);
	}
}
