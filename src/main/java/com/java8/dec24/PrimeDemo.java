package com.java8.dec24;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11, 12, 13);
		list.stream().filter(PrimeDemo::isPrime).collect(Collectors.toList()).forEach(System.out::println);
		IntStream.range(0, 1000).boxed().filter(PrimeDemo::isPrime).collect(Collectors.toList()).forEach(System.out::println);
		
	}

	private static boolean isPrime(int num) {
		// TODO Auto-generated method stub
		
		if(num<2)
			return false;
		else if( num ==2 || num ==3)
			return true;
		else {
			if(num %2 ==0 || num %3 ==0 ) {
				return false;
			}
			return true;
		}
	}

}
