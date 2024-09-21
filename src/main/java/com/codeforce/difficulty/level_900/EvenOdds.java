package com.codeforce.difficulty.level_900;

import java.util.Scanner;

public class EvenOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input values
        long n = scanner.nextLong();
        long k = scanner.nextLong();

        // Calculate the number of odd numbers in the sequence
        long oddCount = (n + 1) / 2;  // Total number of odd numbers is half of n (rounded up)

        // Determine the k-th number
        if (k <= oddCount) {
            // If k is within the odd numbers, the k-th odd number is (2 * k - 1)
            System.out.println(2 * k - 1);
        } else {
            // If k is in the even numbers, calculate its position in the even sequence
            long evenIndex = k - oddCount;
            System.out.println(2 * evenIndex);
        }

        scanner.close();
    }
}
