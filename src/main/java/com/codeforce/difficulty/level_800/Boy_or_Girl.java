package com.codeforce.difficulty.level_800;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Boy_or_Girl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        Set<Character> stringSet = new HashSet<>();
        for (Character ch : string.toCharArray()) {
            stringSet.add(ch);
        }
        System.out.println(stringSet.size()%2!=0?"IGNORE HIM!":"CHAT WITH HER!");
    }
}
