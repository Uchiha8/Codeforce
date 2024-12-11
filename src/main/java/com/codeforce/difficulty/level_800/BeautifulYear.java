package com.codeforce.difficulty.level_800;

import java.util.Scanner;

public class BeautifulYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int year = n + 1;
        boolean status = true;
        while (status) {
            int[] digits = new int[4];
            for (int i = digits.length-1; i >= 0; i--) {
                digits[i] = year % 10;
                year /= 10;
            }
            for (int i = digits.length - 1; i > 0; i--) {
                if (digits[i] == digits[i - 1]) {
                    status = true;
                }
            }
        }
    }
}
