package com.codeforce.difficulty.level_900;

import java.util.Scanner;

public class Football {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        int count = 1;
        for (int i = 1; i < string.length(); i++) {
            if (string.charAt(i) == string.charAt(i - 1)) {
                count++;
                if (count == 7) {
                    System.out.println("YES");
                    return;
                }
            }else {
                count = 1;
            }
        }
        System.out.println("NO");
    }
}
