package com.satishlabs.bitwise;

//Add two numbers without + operator
public class Lab15 {
	public static void main(String[] args) {
		int n = 14;
		int count = 0;
		int rev=0;
		while (n > 0) {
			rev = rev<<1;
			
			if((n & 1)==1)
			{
				rev =rev^1;
			}
			n = n>>1;
			count++;
		}

		System.out.println(rev);
		System.out.println("Loop repeated times " + count);
	}
}

//Time =>o(1)
