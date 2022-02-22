package com.arsatapathy;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class HowSum {

    public static List<Integer> howSum(int targetSum, int[] numbers) {
        if (targetSum == 0) return new LinkedList<>();
        if (targetSum <= -1) return null;

        for (int num : numbers) {
            int rem = targetSum - num;

            List<Integer> list = howSum(rem, numbers);

            if (list != null) {
                list.add(num);
                return list;
            }
        }

        return null;
    }

    public static List<Integer> howSum(int targetSum, int[] numbers, Map<Integer, List<Integer>> memo) {
        if (memo.containsKey(targetSum)) return memo.get(targetSum);
        if (targetSum == 0) return new LinkedList<>();
        if (targetSum <= -1) return null;

        for (int num :numbers) {
            int rem = targetSum - num;

            List<Integer> list = howSum(rem, numbers);

            if (list != null) {
                list.add(num);
                memo.put(rem, list);
                return list;
            }
        }

        return null;
    }

}
