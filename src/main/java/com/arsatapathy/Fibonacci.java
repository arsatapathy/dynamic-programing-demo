package com.arsatapathy;

public class Fibonacci {

    // 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144
    public static int fib(int nth) {
        if (nth == 1 || nth == 2) return 1;

        return fib(nth - 1) + fib(nth - 2);
    }
}
