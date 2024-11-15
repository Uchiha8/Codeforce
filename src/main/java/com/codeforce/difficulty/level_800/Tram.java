package com.codeforce.difficulty.level_800;

import java.util.Scanner;

public class Tram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] array = new int[n][2];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        int res = 0;
        int curPass = 0;
        for (int i = 0; i < array.length; i++) {
            curPass -= array[i][0];
            curPass += array[i][1];
            if (curPass >= res) {
                res = curPass;
            }
        }
        System.out.println(res);
    }
}
