package com.arsatapathy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FibonacciTest {

    @Test
    public void test_01() {
        Assertions.assertEquals(3, Fibonacci.fib(4));
    }
}
