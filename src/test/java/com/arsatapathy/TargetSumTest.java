package com.arsatapathy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class TargetSumTest {

    @Test
    public void test_01() {

        Assertions.assertTrue(TargetSum.canSum(7, new int[]{2, 3, 4, 5}));

    }

    @Test
    public void test_02() {

        Assertions.assertFalse(TargetSum.canSum(7, new int[]{2, 4}));

    }

    @Test
    public void test_03() {

        Assertions.assertTrue(TargetSum.canSum(7, new int[]{2, 3, 4, 5}, new HashMap<>()));

    }

    @Test
    public void test_04() {

        Assertions.assertFalse(TargetSum.canSum(300, new int[]{7, 14}, new HashMap<>()));

    }
}
