package com.codeforce.difficulty.level_900;

import java.util.Scanner;

public class IlyaBankAccount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int lastDigit = (n % 10) > 0 ? n % 10 : -1 * n % 10;
        int preLastDigit = ((n % 100) / 10) > 0 ? ((n % 100) / 10) : -1 * ((n % 100) / 10);
        int res = 0;
        if (n > 0) {
            System.out.println(n);
        } else if (n == 0) {
            System.out.println(n);
        } else {
            if (n > -10) {
                res = 0;
            } else {
                n *= -1;
                if (lastDigit < preLastDigit) {
                    res = (n / 100) * 10 + lastDigit;
                } else {
                    res = n / 10;
                }
            }
            res *= -1;
            System.out.println(res);
        }
    }
}
