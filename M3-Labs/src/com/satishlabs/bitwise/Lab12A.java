package com.satishlabs.bitwise;

//Count the Number of Set Bits in given number
//Brain Kerningam's Algorithm
//Visiting all the Bits and Counting only set bits
public class Lab12A {
	public static void main(String[] args) {
		int n = 40;
		int count = 0;

		while (n > 0) {
			n = n & (n - 1);
		count++;
		}
		System.out.println("Set Bit count: " + count);
	}
}
