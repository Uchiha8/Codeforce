package com.codeforce.difficulty.level_800;

import java.util.Scanner;

public class Elephant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int point = scanner.nextInt();
        int steps = point % 5 != 0 ? point / 5 + 1 : point / 5;
        System.out.println(steps);
    }
}
