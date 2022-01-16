package com.arsatapathy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class FibonacciTest {

    @Test
    public void test_01() {
        Assertions.assertEquals(3, Fibonacci.fib(4));
        Assertions.assertEquals(12586269025L, Fibonacci.fib(50));
    }

    @Test
    public void test_02() {
        Assertions.assertEquals(55, Fibonacci.fib(10, new HashMap<>()));
        Assertions.assertEquals(12586269025L, Fibonacci.fib(50, new HashMap<>()));
    }
}
