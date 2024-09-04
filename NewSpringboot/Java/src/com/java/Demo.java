package com.java;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str =new String("Hello");
		StringBuilder builder =new StringBuilder("Hello");
		StringBuffer Buffer = new StringBuffer("Hello");
		str.concat("Hi...");
		builder.append("Hi...");
		System.out.println(str);
		System.out.println(builder);
		System.out.println(Buffer);

	}

}
