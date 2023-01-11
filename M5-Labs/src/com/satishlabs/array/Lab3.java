package com.satishlabs.array;

import java.util.ArrayList;
import java.util.List;

public class Lab3 {
	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<>();
		
		myList.add(10);
		myList.add(20);
		myList.add(30);
		myList.add(40);
		myList.add(50);
		
		System.out.println(myList);
				
		myList.add(60);
		System.out.println(myList);
		
	}
}
