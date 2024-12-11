package com.codeforce.difficulty.level_800;

import java.util.Scanner;

public class GeorgeAccommodation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] rooms = new int[n][2];
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                rooms[i][j] = scanner.nextInt();
            }
        }
        int count = 0;
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length-1; j++) {
                int temp = Math.abs(rooms[i][j] - rooms[i][j + 1]);
                if (temp >= 2) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
