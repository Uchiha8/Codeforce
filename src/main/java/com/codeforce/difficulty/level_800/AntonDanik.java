package com.codeforce.difficulty.level_800;

import java.util.Scanner;

public class AntonDanik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int games = scanner.nextInt();
        String s = scanner.next();
        int count = 0;
        for (int i = 0; i < games; i++) {
            if (s.charAt(i) == 'A') {
                count++;
            } else {
                count--;
            }
        }
        if (count > 0) {
            System.out.println("Anton");
        } else if (count < 0) {
            System.out.println("Danik");
        } else {
            System.out.println("Friendship");
        }
    }
}
