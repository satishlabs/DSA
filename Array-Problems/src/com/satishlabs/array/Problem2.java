package com.satishlabs.array;

//Remove the duplicates from sorted array

public class Problem2 {
	public static void main(String[] args) {
		int arr[] = { 10, 10, 20, 20, 20, 30, 40, 40, 40 };

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		int newLength = removeDuplicates(arr);
		System.out.println();
		System.out.println("---------------------");

		for (int i = 0; i < newLength; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	private static int removeDuplicates(int[] arr) {
		int n = arr.length;
		int temp = 1;

		for (int i = 1; i < n; i++) {
			if (arr[i] != arr[temp - 1]) {
				arr[temp] = arr[i];
				temp++;
			}
			arr[i] = 0;
		}
		return temp;
	}
}
