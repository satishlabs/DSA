package com.satishlabs.bitwise;

//Find the two Odd Occurring Number in Array
//
public class Lab17 {
	public static void main(String[] args) {
		int[] arr = {3,5,3,5,7,11};
		int length = arr.length;
		int result = 0;
		for(int i=0; i<length; i++) {
			result = result^arr[i];
		}
		
		int k =result&(~(result-1));
		
		int first = 0;
		int second =0;
		for(int i=0; i<length; i++) {
			if((arr[i]&k)==0)
				first = first^arr[i];
			else
				second = second^arr[i];
		}
		System.out.println(first);
		System.out.println(second);
	}
}

//Time Complexity => O(n^2)
