package com.codeforce.difficulty.level_800;

import java.util.Scanner;

public class Banana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int n = scanner.nextInt();
        int w = scanner.nextInt();
        int total = 0;
        for (int i = 1; i <= w; i++) {
            total += i * k;
        }
        if (total > n) {
            System.out.println(total - n);
        } else {
            System.out.println(0);
        }
    }
}
