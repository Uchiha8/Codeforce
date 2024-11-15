package com.codeforce.difficulty.level_900;

import java.util.Arrays;
import java.util.Scanner;

public class Puzzles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] puzzles = new int[m];
        for (int i = 0; i < puzzles.length; i++) {
            puzzles[i] = scanner.nextInt();
        }
        Arrays.sort(puzzles);
        for (int i = 0; i < puzzles.length; i++) {
            int lim = puzzles.length - 4;
            for (int j = i; j <= lim; j++) {
            }
        }
    }
}
