package com.java8.logical;

import java.util.Arrays;

public class RearrangeArray {
    public static void rearrange(int[] arr) {
        int n = arr.length;
        System.out.println("Arr ; "+Arrays.toString(arr));
        // Step 1: Separate negatives and positives using partitioning logic
        int i = -1;
        for (int j = 0; j < n; j++) {
        	if (arr[j] < 0) {
                i++;
                // Swap negative element to the left
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Now, i points to the last negative number
        int neg = 0; // Pointer for negative numbers
        int pos = i + 1; // Pointer for positive numbers
        System.out.println(" i : "+i);

        // Step 2: Rearrange by alternating between negative and positive
        while (neg < pos && pos < n && arr[neg] < 0) {
            // Swap the negative number at neg with positive number at pos
            int temp = arr[neg];
            arr[neg] = arr[pos];
            arr[pos] = temp;

            // Move pointers forward
            neg += 2; // Every alternate index for negative numbers
            pos++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, -6, -1, -2, 5, 6 };
        rearrange(arr);
        System.out.println(Arrays.toString(arr));
    }
}


