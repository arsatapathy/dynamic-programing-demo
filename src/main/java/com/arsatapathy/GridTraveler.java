package com.arsatapathy;

import java.util.Map;

public class GridTraveler {
    // O(2 ^ row+column) = O(2^n)
    public static long gridTraveler(long row, long column) {
        if (row == 1 && column == 1) return 1;
        if (row == 0 || column == 0) return 0;

        return gridTraveler(row, column -1) + gridTraveler(row -1, column);
    }

    // O(row+column) = O(n)
    public static long gridTraveler(long row, long column, Map<String, Long> memo) {

        if (row == 1 && column == 1) return 1;
        if (row == 0 || column == 0) return 0;

        String key = row + "," + column;

        if (memo.containsKey(key)) return memo.get(key);

        long value = gridTraveler(row, column -1, memo) + gridTraveler(row -1, column, memo);

        memo.put(key, value);
        memo.put(column + "," + row, value);

        return value;
    }

}
