package com.codeforce.difficulty.level_800;

import java.util.Scanner;

public class Word_Capitalization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char s_1 = s.charAt(0);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(String.valueOf(s_1).toUpperCase()).append(s.substring(1));
        System.out.println(stringBuilder.toString());
    }
}
