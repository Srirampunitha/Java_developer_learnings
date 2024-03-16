package com.sri_learning.fp.ex2;

import java.util.List;

public class ReduceFilter {

	public static void main(String[] args) {
	List<Integer> list = List.of(1,4,6,7,4,8);

	
	Fpsum(list);
	}

	private static void sum(List<Integer> list) {
		int sum =0;
		for(int lists : list) {
			sum+=lists;
		}
		System.out.println(sum);
	}
	
	private static void Fpsum(List<Integer> list) {
		System.out.println(list.stream().
		reduce(0,(num1 , num2) -> num1+num2));
	}

}
