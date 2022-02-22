package com.arsatapathy;

import java.util.Map;

public class CountConstruct {

    public static int countConstruct(String targetString, String[] words) {
        int count = 0;

        if (targetString.isEmpty()) return 1;

        for (String word:
             words) {
            if (targetString.startsWith(word)) {
                String newTarget = targetString.replace(word, " ").trim();

                count += countConstruct(newTarget, words);
            }
        }

        return count;
    }

    public static int countConstruct(String targetString, String[] words, Map<String, Integer> memo) {
        int count = 0;

        if (memo.containsKey(targetString)) return memo.get(targetString);
        if (targetString.isEmpty()) return 1;

        for (String word:
                words) {
            if (targetString.startsWith(word)) {
                String newTarget = targetString.replace(word, " ").trim();

                count += countConstruct(newTarget, words);
            }
        }

        memo.put(targetString, count);
        return count;
    }
}
