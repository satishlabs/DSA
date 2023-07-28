package com.satishlabs.array;

//Find whether the Array is Sorted in ASC or Not

public class Problem4 {
	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50 };

		boolean flag = isSorted(arr);
		if (flag)
			System.out.println("Yes Sorted");
		else
			System.out.println("Not Sorted");

	}

	private static boolean isSorted(int[] arr) {
		int n = arr.length;
		for (int i = 1; i < n; i++) {
			if (arr[i - 1] > arr[i]) {
				return false;
			}
		}
		return true;
	}

}
