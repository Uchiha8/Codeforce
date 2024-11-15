package com.codeforce.difficulty.level_800;

import java.util.Scanner;

public class Beautiful_Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[5][5];
        int col_index = 3;
        int row_index = 3;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextInt();
                if (matrix[i][j] == 1) {
                    col_index = i;
                    row_index = j;
                }
            }
        }
        int min_Moves = Math.abs(col_index - 2) + Math.abs(row_index - 2);
        System.out.println(min_Moves);
    }
}
