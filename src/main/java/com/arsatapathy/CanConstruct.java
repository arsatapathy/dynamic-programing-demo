package com.arsatapathy;

import java.util.Map;

public class CanConstruct {
    public static boolean canConstruct(String targetString, String[] words) {
        if (targetString.isEmpty()) return true;

        for (String word:
             words) {
            if (targetString.startsWith(word)) {
                if (canConstruct(targetString.replace(word, " ").trim(), words)) {
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean canConstruct(String targetString, String[] words, Map<String, Boolean> memo) {
        if (memo.containsKey(targetString)) return memo.get(targetString);

        if (targetString.isEmpty()) return true;

        for (String word:
             words) {
            if (targetString.startsWith(word)) {
                String newTarget = targetString.replace(word, " ").trim();
                if (canConstruct(newTarget, words, memo)) {
                    memo.put(newTarget, true);
                    return true;
                }
            }
        }

        return false;
    }
}
