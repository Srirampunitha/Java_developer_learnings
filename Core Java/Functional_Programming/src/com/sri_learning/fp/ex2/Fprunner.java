package com.sri_learning.fp.ex2;

import java.util.List;
import java.util.stream.IntStream;

public class Fprunner {

	public static void main(String[] args) {
	     List<String> list = List.of("Appple" ,"Ant" ,"Bat" );
	    
	     lengthOfStr(list);
	     sumOfTenNum();
	}

	private static void tolowercase(List<String> list) {
		list.stream().map(str -> str.toLowerCase()).forEach(str -> System.out.println(str));
	}
	
	private static void lengthOfStr(List<String> list) {
		list.stream().map(str -> str.length()).forEach(str -> System.out.println(str));
	}
	
	private static void sumOfTenNum() {
		 IntStream.range(1, 11).map(e -> e*e*e).forEach(e -> System.out.println(e));
	}
    
}
