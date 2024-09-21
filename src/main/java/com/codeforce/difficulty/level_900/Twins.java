package com.codeforce.difficulty.level_900;

import java.util.Arrays;
import java.util.Scanner;

public class Twins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arrayCoins = new int[n];
        int totalSum = 0;

        // Input the coin values and compute the total sum
        for (int i = 0; i < n; i++) {
            arrayCoins[i] = scanner.nextInt();
            totalSum += arrayCoins[i];
        }

        // Sort the coins in descending order
        Arrays.sort(arrayCoins);

        int mySum = 0;
        int count = 0;

        // Take coins starting from the largest
        for (int i = n - 1; i >= 0; i--) {
            mySum += arrayCoins[i];
            count++;
            // Check if mySum exceeds the remaining sum
            if (mySum > totalSum - mySum) {
                break;
            }
        }

        // Output the minimum number of coins needed
        System.out.println(count);
    }
}
