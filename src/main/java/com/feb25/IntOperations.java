package com.feb25;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class IntOperations {
	public static void intOperations() {
		minAndMax();
	}

	private static void minAndMax() {
		// TODO Auto-generated method stub
		int arr[] = { 11, 94, 2, 6, 8, 4, 34, 65, 1, 87, 34 };
		int min = Arrays.stream(arr).min().orElseThrow();
		int max = Arrays.stream(arr).max().orElseThrow();

		System.out.println("Minimum: " + min);
		System.out.println("Maximum: " + max);
		List<Integer> list = Arrays.asList( 11, 94, 2, 6, 8, 4, 34, 65, 1, 87, 34 );
		System.out.println("Min : "+list.stream().min(Integer::compareTo).orElseThrow());
		System.out.println("MAX : "+list.stream().max(Integer::compareTo).orElseThrow());
	}
}
