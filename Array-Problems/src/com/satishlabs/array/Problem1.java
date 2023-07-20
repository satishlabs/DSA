package com.satishlabs.array;

//Reverse the given array

public class Problem1 {
	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50 };
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		reverse(arr);
		System.out.println();
		System.out.println("---------------------");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	private static void reverse(int[] arr) {
		int n = arr.length;
		int start = 0;
		int end = arr.length - 1;

		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}

	}
}
