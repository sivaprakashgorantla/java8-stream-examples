package com.java8.walmart;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


/*
 * Rearrange the array in such a way as one negative one positive 
a[] = {1,2,3,-1.-2,5,6,-6}
out put a = {-6,1,-2,2,-1,3,5,6}
 */
public class RearrangeArray {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, -1, -2, 5, 6, -6 };

		// Separate positive and negative numbers
		List<Integer> negative = Arrays.stream(a).filter(n -> n < 0).boxed().collect(Collectors.toList());

		List<Integer> positive = Arrays.stream(a).filter(n -> n >= 0).boxed().collect(Collectors.toList());

		// Combine them in alternate order
		int[] result = new int[a.length];
		int posIdx = 0, negIdx = 0;

		for (int i = 0; i < a.length; i++) {
			if (i % 2 == 0 && negIdx < negative.size()) {
				result[i] = negative.get(negIdx++);
			} else if (posIdx < positive.size()) {
				result[i] = positive.get(posIdx++);
			}
		}

		// Print the result array
		System.out.println("Rearranged array: " + Arrays.toString(result));
	}
}
