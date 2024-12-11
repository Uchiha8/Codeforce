package com.codeforce.difficulty.level_800;

import java.util.Scanner;

public class QueueSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte n = scanner.nextByte();
        byte t = scanner.nextByte();
        String s = scanner.next();
        char[] ch = s.toCharArray();
        for (byte i = 0; i < t; i++) {
            boolean swapped = false;
            for (byte j = 0; j < n - 1; j++) {
                if (ch[j] == 'B' && ch[j + 1] == 'G') {
                    ch[j] = 'G';
                    ch[j + 1] = 'B';
                    j++;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
        System.out.println(String.valueOf(ch));
    }
}
