package com.arsatapathy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;

public class BestSumTest {

    @Test
    public void test_01() {
        Assertions.assertEquals(List.of(5, 2), BestSum.bestSum(7, new int[]{2, 3, 5}));
    }

    @Test
    public void test_02() {
        Assertions.assertEquals(List.of(3, 3), BestSum.bestSum(6, new int[]{2, 3, 5}));
    }

    @Test
    public void test_03() {
        Assertions.assertNull(BestSum.bestSum(300, new int[]{14, 7}, new HashMap<>()));
    }

    @Test
    public void test_04() {
        Assertions.assertEquals(List.of(5, 2), BestSum.bestSum(7, new int[]{2, 3, 5}, new HashMap<>()));
    }

    @Test
    public void test_05() {
        Assertions.assertEquals(List.of(3, 3), BestSum.bestSum(6, new int[]{2, 3, 5}, new HashMap<>()));
    }

}
