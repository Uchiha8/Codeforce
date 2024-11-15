package com.codeforce.difficulty.level_800;

import java.util.Scanner;

public class Petya_Strings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        char[] char_1 = str1.toLowerCase().toCharArray();
        char[] char_2 = str2.toLowerCase().toCharArray();
        boolean status = true;
        for (int i = 0; i < char_1.length; i++) {
            if (char_1[i] > char_2[i]) {
                System.out.println(1);
                status = false;
                break;
            } else if (char_1[i] < char_2[i]) {
                System.out.println(-1);
                status = false;
                break;
            }
        }
        if (status) {
            System.out.println(0);
        }

    }
}
