package com.codeforce.difficulty.level_800;

import java.util.Scanner;

public class Stones_On_Table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();
        int min = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                min++;
            }
        }
        System.out.println(min);
    }
}