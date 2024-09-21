package com.codeforce.contest_1;

import java.util.Scanner;

public class RobinHoodMajorOak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int leaves = 0;
            for (int j = 1; j <= n; j++) {
                leaves += (int) Math.pow(j, j);
                int con = j - k;
                if (con > 0) {
                    leaves -= (int) Math.pow(con, con);
                }
            }
            System.out.println(leaves % 2 == 0 ? "YES" : "NO");
        }
    }
}
