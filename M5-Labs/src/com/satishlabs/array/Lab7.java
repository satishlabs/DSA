package com.satishlabs.array;

//Delete a element in array at given position

public class Lab7 {
	public static void main(String[] args) {
		// int arr[] = {10,20,30,40,50};
		int arr[] = new int[6];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		int pos = 3;

		System.out.println("-------------------");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		int newLength = delete(arr, pos);

		System.out.println("-------------------");
		for (int i = 0; i < newLength; i++) {
			System.out.println(arr[i]);
		}
	}

	private static int delete(int[] arr, int pos) {
		int n = arr.length;
		int index = pos - 1;
		for (int i = index; i < n - 1; i++) {
			arr[i] = arr[i + 1];
		}

		arr[n - 1] = 0;

		return n - 1;
	}
}
