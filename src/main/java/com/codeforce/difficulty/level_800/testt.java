package com.codeforce.difficulty.level_800;

import java.util.Formatter;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class testt {
    public static void main(String[] args) {
        try {
            throw new NullPointerException("A");
        } catch (ArithmeticException e) {
            System.out.println("B");
        }
    }
}
