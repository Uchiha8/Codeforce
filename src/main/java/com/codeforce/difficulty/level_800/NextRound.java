package com.codeforce.difficulty.level_800;

import java.util.Scanner;

public class NextRound {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] con = new int[n];
        int count = 0;

        // Reading the scores
        for (int i = 0; i < n; i++) {
            con[i] = scanner.nextInt();
        }

        int kScore = con[k - 1]; // Score of the k-th participant

        // Counting participants who advance
        for (int i = 0; i < n; i++) {
            if (con[i] >= kScore && con[i] > 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}
