package com.satishlabs.bitwise;

//Count the Number of Set Bits in given number
//Visiting all the Bits and Counting only Set Bits
public class Lab12B {
	public static void main(String[] args) {
		int n = 2;
		int count = 0;
		int loopCount = 0;

		while (n > 0) {
			loopCount++;
			if ((n & 1) != 0)
				count++;

			n = n / 2;
		}
		System.out.println("Loop Count: " + loopCount);
		System.out.println("Set Bit count: " + count);
	}
}
