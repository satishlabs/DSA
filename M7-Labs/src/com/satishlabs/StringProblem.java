package com.satishlabs;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringProblem {
	public static void main(String[] args) {
		String str="illovejavaprogram";
		//count occurrence of each character
		Map<String, Long> map = Arrays.stream(str.split(""))
					.collect(Collectors
							.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println("Occurance of character : "+map);
		System.out.println("-------------------------");
		
		//Find all duplicate element of given String
		List<String> duplicateElements = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				.entrySet().stream().filter(x -> x.getValue()>1).map(Map.Entry::getKey)
				.collect(Collectors.toList());
		System.out.println("Duplicate Elements: "+duplicateElements);
		System.out.println("-------------------------");
		//Find non duplicate element in given String
		List<String> uniqueElement = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				.entrySet().stream().filter(x -> x.getValue()==1).map(Map.Entry::getKey)
				.collect(Collectors.toList());
		System.out.println("Unique Elements : "+uniqueElement);
		System.out.println("-------------------------");
		//Find first non-repeat element from given String
		String firstNonRepeated = Arrays.stream(str.split(""))
							.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()))
							.entrySet().stream().filter(e -> e.getValue()==1)
							.findFirst().get().getKey();
		System.out.println("First Non Repeated : "+firstNonRepeated);
		System.out.println("-------------------------");
		//First Repeated
		String firstRepeated = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
				.entrySet().stream().filter(e -> e.getValue()>1).findFirst().get().getKey();
		System.out.println("First Repeated : "+firstRepeated);
	}
}
