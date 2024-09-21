package com.codeforce.difficulty.level_900;

import java.util.Scanner;

public class HQ9_Plus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String program = scanner.next();
        // Check if the program contains 'H', 'Q', or '9', which generate output.
        if (program.contains("H") || program.contains("Q") || program.contains("9")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        scanner.close();
    }
}
