package com.satishlabs.bitwise;

//Find the One Odd Occurring Number in Array
//
public class Lab16 {
	public static void main(String[] args) {
		int[] arr = {3,5,7,3,7,5,9,9,9};
		int length = arr.length;
		for(int i=0; i<length; i++) {
			int count=0;
			for(int j=0; j<length; j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}//Inner for loop
			if(count%2!=0) {
				System.out.println(arr[i]);
				break;
			}
		}//Outer loop
	}
}

//Time Complexity => O(n^2)
