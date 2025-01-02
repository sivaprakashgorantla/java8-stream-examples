package com.java8;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeNumberInArrayList {
	public static void main(String[] args) {
		List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11, 12, 13);

		list.stream().filter(PrimeNumberInArrayList::isPrime).collect(Collectors.toList()).forEach(System.out::println);
		IntStream.rangeClosed(0, 1000).filter(PrimeNumberInArrayList::isPrime).boxed().collect(Collectors.toList()).forEach(System.out::println);
		System.out.println("-----------------");
		IntStream.range(0, 1000).filter(PrimeNumberInArrayList::isPrime).boxed().collect(Collectors.toList()).forEach(System.out::println);

	}

	public static boolean isPrime(int number) {
		if (number < 2) {
			return false;
		} else if (number == 2 || number == 3) {
			return true;
		} else {
			if (number % 2 == 0 || number % 3 == 0) {
				return false;
			}
			return true;
		}

	}
}
