package com.java8.walmart;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class PartitionEvenOddExample {

    public static void main(String[] args) {
        /* Using HashSet constructor to allow duplicates during initialization*/
        Set<Integer> set = new HashSet<>(Set.of(4, 3, 5, 7, 2, 8, 97));

        Map<Boolean, Set<Integer>> partitionedNumbers = partitionNumbers(set); 
        System.out.println(partitionedNumbers);
    }

    private static Map<Boolean, Set<Integer>> partitionNumbers(Set<Integer> set) {
        return set.stream()
                  .collect(Collectors.partitioningBy(i -> i % 2 == 0, Collectors.toSet()));
    }
}
