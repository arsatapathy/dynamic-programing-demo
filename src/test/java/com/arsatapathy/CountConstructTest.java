package com.arsatapathy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class CountConstructTest {

    @Test
    public void test_01() {
        Assertions.assertEquals(3, CountConstruct.countConstruct("ABCDEF", new String[]{"ABC", "DEF", "A", "BCDEF", "AB", "CDEF"}));
    }

    @Test
    public void test_02() {
        Assertions.assertEquals(3, CountConstruct.countConstruct("ABCDEF", new String[]{"ABC", "DEF", "A", "BCDEF", "AB", "CDEF"}, new HashMap<>()));
    }
}
