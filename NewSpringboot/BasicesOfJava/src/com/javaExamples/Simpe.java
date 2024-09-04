package com.javaExamples;

public class Simpe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "radar";
		char[] ch = s.toCharArray();

		for (int i = ch.length - 1; i >= 0; i--) {
			if (s.equals(ch[i])) {
				System.out.println("Given string is palidrome");
			} else {
				System.out.println("Given string is not palidrome");
			}
		}
	}

}
