package com.arsatapathy;

import java.util.Map;

public class TargetSum {

    public static boolean canSum(int targetSum, int[] numbers) {
        if (targetSum == 0) return true;
        if (targetSum < 0) return false;

        for (int number:
             numbers) {
            int reminder = targetSum - number;

            if (canSum(reminder, numbers)) {
                return true;
            }
        }

        return false;
    }

    public static boolean canSum(int targetSum, int[] numbers, Map<Integer, Boolean> memo) {

        if (memo.containsKey(targetSum)) return memo.get(targetSum);

        if (targetSum == 0) return true;
        if (targetSum < 0) return false;

        for (int number:
                numbers) {
            int reminder = targetSum - number;

            if (canSum(reminder, numbers)) {
                memo.put(targetSum, true);
                return  true;
            }
        }

        return false;
    }
}
