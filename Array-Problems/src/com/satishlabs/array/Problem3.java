package com.satishlabs.array;

//Move all zero to last

public class Problem3 {
	public static void main(String[] args) {
		int arr[] = { 10, 20, 0, 0, 25, 0, 20, 0, 99 };

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		int nonZeroCount = moveZerosEnd(arr);
		System.out.println();
		System.out.println("---------------------");

		// Print All

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n");
		// Print non -zero
		for (int i = 0; i < nonZeroCount; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	private static int moveZerosEnd(int[] arr) {
		int n = arr.length;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] != 0) {
				int x = arr[i];
				arr[i] = arr[temp];
				arr[temp] = x;
				temp++;
			}
		}
		return temp;
	}

}
