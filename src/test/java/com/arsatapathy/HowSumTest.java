package com.arsatapathy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;

public class HowSumTest {

    @Test
    public void test_01() {
        Assertions.assertEquals(List.of(3, 2, 2), HowSum.howSum(7, new int[]{2, 3, 4, 5}));
    }

    @Test
    public void test_02() {
        Assertions.assertNull(HowSum.howSum(7, new int[]{3, 5}));
    }

    @Test
    public void test_03() {
        Assertions.assertEquals(List.of(), HowSum.howSum(0, new int[]{3, 5}));
    }

    @Test
    public void test_04() {
        Assertions.assertEquals(List.of(3, 2, 2), HowSum.howSum(7, new int[]{2, 3, 4, 5}, new HashMap<>()));
    }

    @Test
    public void test_05() {
        Assertions.assertNull(HowSum.howSum(7, new int[]{3, 5}, new HashMap<>()));
    }

    @Test
    public void test_06() {
        Assertions.assertEquals(List.of(), HowSum.howSum(0, new int[]{3, 5}, new HashMap<>()));
    }

    @Test
    public void test_07() {
        Assertions.assertNull(HowSum.howSum(300, new int[]{7, 14}, new HashMap<>()));
    }
}
