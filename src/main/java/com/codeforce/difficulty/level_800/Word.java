package com.codeforce.difficulty.level_800;

import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int upperCount = 0;
        int lowerCount = 0;
        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i);
            if (index >= 65 && index <= 90) {
                upperCount++;
            }else {
                lowerCount++;
            }
        }
        if (upperCount > lowerCount) {
            System.out.println(s.toUpperCase());
        } else {
            System.out.println(s.toLowerCase());
        }
    }
}
