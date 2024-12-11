package com.codeforce.difficulty.level_800;

import java.util.Scanner;

public class VanyaFence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int h = scanner.nextInt();
        int[] friends = new int[n];
        int res = 0;
        for (int i = 0; i < n; i++) {
            friends[i] = scanner.nextInt();
            if (friends[i] > h) {
                res++;
            }
            res++;
        }
        System.out.println(res);

    }
}