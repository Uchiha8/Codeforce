package com.codeforce.difficulty.level_800;

import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            int a, b, c;
            a = scanner.nextInt();
            b = scanner.nextInt();
            c = scanner.nextInt();
            if (a + b + c >= 2) {
                count++;
            }
        }
        System.out.println(count);
    }
}
