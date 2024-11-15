package com.codeforce.difficulty.level_800;

import java.util.Scanner;

public class NearlyLuckyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        String num = n + "";
        int count = 0;
        for (int i = 0; i < num.length(); i++) {
            if (num.charAt(i) == '4' || num.charAt(i) == '7') {
                count++;
            }
        }
        String res = count + "";
        boolean status = true;
        for (int i = 0; i < res.length(); i++) {
            if (res.charAt(i) != '4' && res.charAt(i) != '7') {
                status = false;
                break;
            }
        }
        if (status) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
