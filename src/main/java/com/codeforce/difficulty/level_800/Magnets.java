package com.codeforce.difficulty.level_800;

import java.util.Scanner;

public class Magnets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < str.length; i++) {
            str[i] = scanner.next();
        }
        if (n == 1) {
            System.out.println(1);
        } else {
            int count = 0;
            for (int i = 0; i < str.length - 1; i++) {
                if (!str[i].equals(str[i + 1])) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
