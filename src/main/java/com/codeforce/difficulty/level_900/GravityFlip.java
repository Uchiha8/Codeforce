package com.codeforce.difficulty.level_900;

import java.util.Arrays;
import java.util.Scanner;

public class GravityFlip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] columns = new int[n];

        // Input reading loop
        for (int i = 0; i < n; i++) {
            columns[i] = scanner.nextInt();
        }

        // Sorting the array
        Arrays.sort(columns);

        // Outputting the sorted array
        for (int column : columns) {
            System.out.print(column + " ");
        }

        scanner.close();
    }
}
