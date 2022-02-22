package com.arsatapathy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class CanConstructTest {

    @Test
    public void test_01() {
        Assertions.assertTrue(CanConstruct.canConstruct("ABCDEF", new String[]{"ABC", "XYZ", "DEF"}));
    }

    @Test
    public void test_02() {
        Assertions.assertFalse(CanConstruct.canConstruct("ABCDEF", new String[]{"XYZ", "DFE"}));
    }

    @Test
    public void test_03() {
        Assertions.assertTrue(CanConstruct.canConstruct("ABCDEF", new String[]{"ABC", "XYZ", "DEF"}, new HashMap<>()));
    }

    @Test
    public void test_04() {
        Assertions.assertFalse(CanConstruct.canConstruct("ABCDEF", new String[]{"XYZ", "DFE"}, new HashMap<>()));
    }
}
