package com.codeforce.difficulty.level_900;

import java.util.Scanner;

public class GameSticks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int temp = Math.min(n, m);
        if (temp % 2 == 0) {
            System.out.println("Malvika");
        } else {
            System.out.println("Akshat");
        }
    }
}
