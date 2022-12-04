package com.satishlabs.bitwise;

//Add two numbers without + operator
public class Lab15 {
	public static void main(String[] args) {
		int a = 71;
		int b = 51;
		
		while(b > 0) {
			int temp = (a&b) <<1;
			a = a^b;
			b = temp;
		}
		System.out.println(a);
	}
}

//Time Complexity => O(1)
