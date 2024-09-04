package com.java;

import java.util.Arrays;
import java.util.Comparator;

import java.util.List;

public class Element {
	//Given a list of numbers below:
		//4, 3, 6, 4, 1

		//What is the largest element in the list? → 6

	//	What is the 3rd largest element in the list? → 4

		//Given a list of numbers, find the kth largest element in the list.

	public static void main(String[] args) {
		
		List<Integer> list =Arrays.asList(4, 3, 6, 5, 1);
		Integer li=list.stream().sorted(Comparator.reverseOrder()).skip(2).findFirst().get();
		System.out.println(li);
		
		
		
		
		
		
	

	}

}
