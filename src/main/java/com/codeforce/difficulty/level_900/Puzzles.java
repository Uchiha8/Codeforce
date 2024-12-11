package com.codeforce.difficulty.level_900;

import java.util.Arrays;
import java.util.Scanner;

public class Puzzles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] puzzles = new int[m];
        for (int i = 0; i < m; i++) {
            puzzles[i] = scanner.nextInt();
        }
        Arrays.sort(puzzles);
        int minD = Integer.MAX_VALUE;
        for (int i = 0; i <= m - n; i++) {
            int curD = puzzles[i + n - 1] - puzzles[i];
            minD = Math.min(minD, curD);
        }
        System.out.println(minD);
    }
}
