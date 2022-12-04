package com.satishlabs.bitwise;

//Find the One Odd Occurring Number in Array
//
public class Lab16A {
	public static void main(String[] args) {
		int[] arr = {3,5,7,3,7,5,9,9,9};
		int length = arr.length;
		int result = 0;
		for(int i=0; i<length; i++) {
			result  = result^arr[i];
		}
		System.out.println(result);
	}
}

//Time Complexity => O(n^2)
