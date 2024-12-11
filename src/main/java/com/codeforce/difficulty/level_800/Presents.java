package com.codeforce.difficulty.level_800;

import java.util.Scanner;

public class Presents {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] friends = new int[n];
        for (int i = 0; i < n; i++) {
            friends[i] = scanner.nextInt();
        }
        int[] res = new int[n];
        for (int i = 0; i < friends.length; i++) {
            res[friends[i]-1] = i+1;
        }
        for (Integer t : res) {
            System.out.println(t);
        }
    }
}
