package com.java8.walmart;

import java.util.stream.IntStream;

public class PalendromeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "SIVAVIS";
		boolean flag = IntStream.range(1, str.length()/2 ).allMatch( i -> str.charAt(i) == str.charAt(str.length() -i -1));
		
		System.out.println("is palendrome : "+((flag == true ? "True" : " False")));
		
		//.mapToObj(i -> str.charAt(i -1 ) != str.charAt(str.length()-i)).
	}

}
