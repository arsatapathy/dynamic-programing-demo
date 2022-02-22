package com.arsatapathy;

import java.util.Map;

public class TargetSum {

    public static boolean canSum(int targetSum, int[] numbers) {
        if (targetSum == 0) return true;
        if (targetSum <= -1) return false;

        for (int num : numbers) {
            int rem = targetSum - num;

            if (canSum(rem, numbers)) {
                return true;
            }
        }

        return false;
    }

    public static boolean canSum(int targetSum, int[] numbers, Map<Integer, Boolean> memo) {
        if (memo.containsKey(targetSum)) return memo.get(targetSum);

        if (targetSum == 0) return true;
        if (targetSum <= -1) return false;

        for (int num : numbers) {
            int rem = targetSum - num;

            if (canSum(rem, numbers, memo)) {
                memo.put(rem, true);
                return true;
            }
        }

        return false;
    }
}
