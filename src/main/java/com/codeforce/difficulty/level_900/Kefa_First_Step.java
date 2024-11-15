package com.codeforce.difficulty.level_900;

import java.util.Scanner;

public class Kefa_First_Step {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] array = new long[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextLong();
        }
        int max = 1;
        int count = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] >= array[i - 1]) {
                count++;
            } else {
                max = Math.max(max, count);
                count = 1;
            }
        }
        max = Math.max(max, count);
        System.out.println(max);
    }
}
