package com.java;

public class CountOccurence {


	public static void main(String[] args) {

		String s = "yamuna";
		/*char ch = 'a';
		int count = 0;
		for (int i = 0; i <= s.length(); i++) {
			if (s.charAt(i) == ch) {
				count++;
			}

		}
		System.out.println("occurences of" +ch+  "are"+count);*/
		/*
		
		 Long count=str.chars().filter(y->y =='m').count();
		 System.out.println( "occurences of a are"+count);*/
		
		/*for(int i=0;i<=s.length();i++) {
			Boolean uni= true;
			for (int j=0;j<=s.length();j++) {
				if(i!=j && s.charAt(i)==s.charAt(j)) {
					uni= false;
					
				}
			}
			if(uni) {
				System.out.println(s.charAt(i));
				}
		}*/
		  s.chars().distinct().forEach(System.out::print);
		
		
	
 }
}
