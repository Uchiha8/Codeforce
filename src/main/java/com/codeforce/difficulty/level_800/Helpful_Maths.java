package com.codeforce.difficulty.level_800;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Helpful_Maths {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                list.add(1);
            } else if (s.charAt(i) == '2') {
                list.add(2);
            } else if (s.charAt(i) == '3') {
                list.add(3);
            }
        }
        Collections.sort(list);
        StringBuilder stringBuilder = new StringBuilder();
        for (Integer i : list) {
            stringBuilder.append(i).append("+");
        }
        System.out.println(stringBuilder.substring(0, stringBuilder.length() - 1));
    }
}
