package com.satishlabs.array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ArraySortingProblem {
	public static void main(String[] args) {
		int[] number = { 4, 22, 12, 54, 67, 2, 10, 1 };// primitive type so we need to apply Auto boxing
		// Sort the Element in reverse order

		List<Integer> sortList = Arrays.stream(number).boxed().sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		System.out.println("Sort Element Reverse Order : " + sortList);
		System.out.println("---------------------");

		// Find second highest integer number from array
		Integer secondHighestElement = Arrays.stream(number).boxed().sorted(Comparator.reverseOrder()).skip(1)
				.findFirst().get();
		System.out.println("Second Highest Element : "+secondHighestElement);
		System.out.println("---------------------");
		
		//Find Second lowest integer number from array
		Integer secondLowest = Arrays.stream(number).boxed().sorted().skip(1).findFirst().get();
		System.out.println("Second Lowest Element : "+secondLowest);
		System.out.println("---------------------");
		
		//Find Element starts with 1
		List<String> elementFind = Arrays.stream(number).boxed().map(num -> num+"").filter(num ->num.startsWith("1")).collect(Collectors.toList());
		System.out.println("Find Element start with 1 "+elementFind);
		System.out.println("---------------------");
		
		//Find longest String in given array
		String[] strArray={"webservice","microservice","corejava","Hibernate","springboot"};
		String longString = Arrays.stream(strArray).reduce((w1,w2)-> w1.length()>w2.length()?w1:w2).get();
		System.out.println("Longest String in given Array : "+longString);
		System.out.println("---------------------");
		
		//String join problem
		List<String> array = Arrays.asList("4","6","7","8","3");
		//Print element like 4-6-7-8-3
		String output = String.join("-", array);
		System.out.println("Append Element - : "+output);
	
		
	}
}
