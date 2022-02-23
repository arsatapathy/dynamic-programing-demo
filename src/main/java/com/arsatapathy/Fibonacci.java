package com.arsatapathy;

import java.util.Arrays;
import java.util.Map;

public class Fibonacci {

    // 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144
    // O(2^n)
    public static long fib(long nth) {
        if (nth == 1 || nth == 2) return 1;

        return fib(nth - 1) + fib(nth - 2);
    }

    // Memoization - O(n)
    public static long fib(long nth, Map<Long, Long> memo) {
        if (memo.containsKey(nth)) return memo.get(nth);
        if (nth == 1 || nth == 2) return 1;

        long value = fib(nth - 1, memo) + fib(nth -2, memo);
        memo.put(nth,value);
        return value;
    }

    public static long fib(int nth) {

        long[] table = new long[nth+1];

        // Base Case
        table[1] = 1 ;

        for (int i = 0; i < table.length; i ++) {
            if (i < table.length - 1) table[i+1] += table[i];
            if (i < table.length - 2) table[i+2] += table[i];
        }

        return table[nth];
    }
}
