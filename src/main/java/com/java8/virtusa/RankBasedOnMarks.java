package com.java8.virtusa;

import java.util.*;

public class RankBasedOnMarks {
    public static void main(String[] args) {
        // Input scores
        int[] scores = {89, 88, 79, 74, 84, 74, 74, 74, 74, 64, 56, 56, 25};

        // Step 1: Sort scores in descending order and preserve indices
        Integer[] indices = new Integer[scores.length];
        for (int i = 0; i < scores.length; i++) {
            indices[i] = i;
        }

        Arrays.sort(indices, (i, j) -> Integer.compare(scores[j], scores[i])); // Sort indices by scores in descending order

        // Step 2: Assign ranks
        int[] ranks = new int[scores.length];
        int currentRank = 1;
        ranks[indices[0]] = currentRank;

        for (int i = 1; i < indices.length; i++) {
            if (scores[indices[i]] != scores[indices[i - 1]]) {
                currentRank = i + 1;
            }
            ranks[indices[i]] = currentRank;
        }

        // Step 3: Create a list of pairs to sort by rank
        List<int[]> rankList = new ArrayList<>();
        for (int i = 0; i < scores.length; i++) {
            rankList.add(new int[]{scores[i], ranks[i]});
        }

        // Sort by rank in ascending order
        rankList.sort(Comparator.comparingInt(o -> o[1]));

        // Step 4: Print the result
        System.out.println("Scores and Ranks (sorted by rank):");
        for (int[] pair : rankList) {
            System.out.println(pair[0] + " " + pair[1]);
        }
    }
}
