package com.satishlabs.array;

import java.util.ArrayList;

import java.util.List;
//Search for given Element in the Unsorted Array 

public class Lab4 {

	public static int linearSearch(int arr[], int element) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			if (arr[i] == element) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = { 25, 10, 5, 15, 30, 20, 50 };
		int element = 15;

		int index = linearSearch(arr, element);

		if (index == -1)
			System.out.println("Element Not Found");
		else
			System.out.println("Element Found of Index: " + index);

	}
}
