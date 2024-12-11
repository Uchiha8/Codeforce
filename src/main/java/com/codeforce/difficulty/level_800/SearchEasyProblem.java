package com.codeforce.difficulty.level_800;

import java.util.Scanner;

public class SearchEasyProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean hard = false;
        for (int i = 0; i < n; i++) {
            int res = scanner.nextInt();
            if (res == 1) {
                hard = true;
                break;
            }
        }
        System.out.println(hard ? "HARD" : "EASY");
    }
}
