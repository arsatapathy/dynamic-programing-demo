package com.arsatapathy;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class BestSum {

    public static List<Integer> bestSum(int targetSum, int[] numbers) {
        List<Integer> bestSum = null;

        if (targetSum == 0) return new LinkedList<>();
        if (targetSum < 0) return null;

        for (int num : numbers) {
            int rem = targetSum - num;

            List<Integer> listReturned = bestSum(rem, numbers);

            if (listReturned != null) {
                listReturned.add(num);

                if (bestSum == null || bestSum.size() > listReturned.size())
                    bestSum = listReturned;
            }
        }

        return bestSum;
    }

    public static List<Integer> bestSum(int targetSum, int[] numbers, Map<Integer, List<Integer>> memo) {
        List<Integer> bestSum = null;

        if (memo.containsKey(targetSum))
            return memo.get(targetSum);

        if (targetSum == 0)
            return new LinkedList<>();

        if (targetSum < 0)
            return null;

        for (int num : numbers) {
            int rem = targetSum - num;

            List<Integer> returnList = bestSum(rem, numbers);

            if (returnList != null) {
                returnList.add(num);

                if (bestSum == null || bestSum.size() > returnList.size()) {
                    bestSum = returnList;
                }
            }
        }

        memo.put(targetSum, bestSum);
        return bestSum;
    }

}
