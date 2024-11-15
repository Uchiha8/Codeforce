package com.codeforce.difficulty.level_900;

import java.util.Scanner;

public class DubStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String[] strings = string.split("WUB");
        StringBuilder stringBuilder = new StringBuilder();
        for (String s : strings) {
            if (!s.equals("")) {
                stringBuilder.append(s).append(" ");
            }
        }
        System.out.println(stringBuilder.toString().trim());
    }
}
