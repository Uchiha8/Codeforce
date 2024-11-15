package com.codeforce.difficulty.level_800;

import java.util.Scanner;

public class Bear_Big_Brother {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int year = 0;
        do {
            year++;
            a *= 3;
            b *= 2;
        } while (a <= b);
        System.out.println(year);
    }
}
