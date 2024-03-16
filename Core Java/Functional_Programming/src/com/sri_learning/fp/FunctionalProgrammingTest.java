package com.sri_learning.fp;

import java.util.List;

public class FunctionalProgrammingTest {

	public static void main(String[] args) {
		List<String> list = List.of("Sriram Murugan" ,"Murugan","Aarthi Murugan","Punitha Murugan");
         
		
		printListWithStreamsFilter(list);
	}

	private static void printListWithForLoop(List<String> list) {
		for(String chunk :list) {
			System.out.println(chunk);
		}
	}
	
	private static void printListWithStreams(List<String> list) {
		list.stream().
		forEach(str -> System.out.println(str));
	}
	
	private static void printListWithStreamsFilter(List<String> list) {
		list.stream().filter(str -> str.endsWith("Murugan")).
		forEach(str -> System.out.println(str));
	}

}
