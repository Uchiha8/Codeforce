package com.codeforce.difficulty.level_900;

import java.util.Scanner;

public class OddDivisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        for (int i = 1; i <= test; i++) {
            long n = scanner.nextLong();
            System.out.println(hasOddDivisor(n) ? "YES" : "NO");
        }
    }

    private static boolean hasOddDivisor(long n) {
        while (n % 2 == 0) {
            n /= 2;
        }
        return n > 1;
    }
}
