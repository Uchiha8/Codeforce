package com.codeforce.contest_1;

import java.util.Scanner;

public class RobinHelps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int m = 0; m < t; m++) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextInt();
            }
            int robinGold = 0;
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (array[i] >= k) {
                    robinGold += array[i];
                }
                if (array[i] == 0 && robinGold > 0) {
                    robinGold--;
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
