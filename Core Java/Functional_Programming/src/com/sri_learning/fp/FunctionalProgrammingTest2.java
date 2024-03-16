package com.sri_learning.fp;

import java.util.List;

public class FunctionalProgrammingTest2 {

	public static void main(String[] args) {
		List<Integer> list = List.of(12,34,5,7,6,9);
         
		
		printListWithStreams(list);
	}

	private static void printListWithForLoop(List<Integer> list)
	{
		System.out.println("I am printListWithForLoop");
		for(int chunk :list) {
			System.out.println(chunk);
		}
	}
	
	private static void printListWithStreams(List<Integer> list) {
		System.out.println("I am printListWithStreams");
		list.stream().
		forEach(str -> System.out.println(str));
	}
	
	private static void printListWithStreamsFilter(List<Integer> list) {
		System.out.println("I am printListWithStreamsFilter");
		list.stream().filter(value -> value%2==0).
		forEach(str -> System.out.println(str));
	}

}
