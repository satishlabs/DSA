package com.satishlabs.bitwise;

public class Lab4 {
	public static void main(String[] args) {
		int p = 3;

		System.out.println(p ^ p);
		System.out.println(p ^ 0);
		System.out.println(0 ^ p);

		int a = 9;
		int b = 12;
		int c = 25;

		int x = a ^ b;
		int y = b ^ a;

		System.out.println(x);
		System.out.println(y);

		x = (a ^ b) ^ c;
		y = a ^ (b ^ c);

		System.out.println(x);
		System.out.println(y);

		// 1. (a ^ b) ^ c = a ^ (b ^ c)
		// 2. a^0=a
		// 3. a^a=0
		// 4. a^b = b^a
	}
}
