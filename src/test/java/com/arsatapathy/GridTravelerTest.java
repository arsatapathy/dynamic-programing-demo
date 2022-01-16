package com.arsatapathy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class GridTravelerTest {

    @Test
    public void test_01() {
        Assertions.assertEquals(1, GridTraveler.gridTraveler(1, 1));
    }

    @Test
    public void test_02() {
        Assertions.assertEquals(15, GridTraveler.gridTraveler(5, 4));
    }

    @Test
    public void test_03() {
        Assertions.assertEquals(8308281242850L, GridTraveler.gridTraveler(50, 15, new HashMap<>()));
    }


}
