package com.satishlabs.bitwise;

import java.util.HashMap;
import java.util.Map;

//Find the Occurrence of each element in the array 

//
public class Lab18 {
	public static void main(String[] args) {
		int[] arr = {3,5,3,7,9,9,6};
		int length = arr.length;
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<length; i++) {
			int count=0;
			for(int j=0; j<length; j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}//Inner Loop
			
				map.put(arr[i], count);
				
			
		}//Outer loop
		System.out.println(map);
	}
}

//Time Complexity => O(n^2)
