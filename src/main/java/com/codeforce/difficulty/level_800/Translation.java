package com.codeforce.difficulty.level_800;

import java.util.Scanner;

public class Translation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = scanner.nextLine();
        String reversedS = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            reversedS = ch + reversedS;
        }
        if (reversedS.equals(t)) {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
