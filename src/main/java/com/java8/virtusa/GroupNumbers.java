package com.java8.virtusa;
import java.util.*;

/*Input:
Copy code
     10, 20, 10, 40, 20, 30, 40, 50
Output:
Copy code
10,10
20,20
30
40,40
50
*/

public class GroupNumbers {
    public static void main(String[] args) {
        // Input numbers
        int[] numbers = {10, 20, 10, 40, 20, 30, 40, 50};

        // Step 1: Use a LinkedHashMap to group numbers
        Map<Integer, List<Integer>> numberGroups = new LinkedHashMap<>();
        for (int num : numbers) {
            numberGroups.putIfAbsent(num, new ArrayList<>());
            numberGroups.get(num).add(num);
        }

        // Step 2: Print the grouped numbers
        System.out.println("Grouped Numbers:");
        for (Map.Entry<Integer, List<Integer>> entry : numberGroups.entrySet()) {
            List<Integer> group = entry.getValue();
            System.out.println(String.join(",", group.stream()
                    .map(String::valueOf)
                    .toArray(String[]::new)));
        }
    }
}
