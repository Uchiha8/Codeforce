package com.codeforce.difficulty.level_800;

import java.util.Scanner;

public class BitPlusPlus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int res = 0;
        for (int i = 0; i < n; i++) {
            String expression = scanner.next();
            if (expression.contains("+")) {
                res++;
            } else {
                res--;
            }
        }
        System.out.println(res);
    }
}
