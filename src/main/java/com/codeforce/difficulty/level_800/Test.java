package com.codeforce.difficulty.level_800;

import java.util.List;
import java.util.Objects;

public class Test {
    int x = 2;
    public static void main(String[] args) {
        final int y;
        Test m = new Test();
        doIt(m);
        System.out.print(m.x);
        doIt(m);
        y = m.x;
        System.out.print(y);
    }

    public static void doIt(Test a) {
        a.x += 2;
    }
}
