package com.arsatapathy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class AllConstructTest {

    @Test
    public void test_01() {
        Assertions.assertEquals(List.of("DEF", "ABC", "CDEF", "AB"), AllConstruct.allCombinations("ABCDEF", new String[]{"ABC", "DEF", "AB", "XYZ", "CDEF"}));
    }
}
