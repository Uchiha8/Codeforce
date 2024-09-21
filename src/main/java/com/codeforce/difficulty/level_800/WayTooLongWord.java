package com.codeforce.difficulty.level_800;

import java.util.Scanner;

public class WayTooLongWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        for (int i = 0; i < test; i++) {
            String string = scanner.next();
            if (string.length() > 10) {
                String stringBuilder = String.valueOf(string.charAt(0)) +
                        (string.length() - 2) +
                        string.charAt(string.length() - 1);
                System.out.println(stringBuilder);
            } else {
                System.out.println(string);
            }
        }
    }
}
