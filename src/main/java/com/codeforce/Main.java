package com.codeforce;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input values
        int n = scanner.nextInt(); // number of elements in the sequence
        int k = scanner.nextInt(); // number of allowed differences

        // Input sequence elements
        int[] nNumbers = new int[n];
        for (int i = 0; i < n; i++) {
            nNumbers[i] = scanner.nextInt();
        }

        // Input allowed differences
        int[] kNumbers = new int[k];
        for (int i = 0; i < k; i++) {
            kNumbers[i] = scanner.nextInt();
        }

        // Variable to track the length of the longest subsequence
        int count = 1;
        int currentLength = 1;

        // Start traversing through nNumbers array
        for (int i = 0; i < n - 1; i++) {
            int dif = Math.abs(nNumbers[i + 1] - nNumbers[i]);
            boolean match = false;

            // Check if the difference is one of the allowed differences
            for (int j = 0; j < k; j++) {
                if (dif == kNumbers[j]) {
                    match = true;
                    break;
                }
            }

            if (match) {
                // If the difference matches, increment the current subsequence length
                currentLength++;
            } else {
                // If no match, reset current subsequence length
                currentLength = 1;
            }

            // Update the count with the max subsequence length found
            count = Math.max(count, currentLength);
        }

        // Output the length of the longest subsequence
        System.out.println(count);
    }
}