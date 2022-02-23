package com.arsatapathy;

import java.util.LinkedList;
import java.util.List;

public class AllConstruct {

    public static List<String> allCombinations(String targetString, String[] words) {
        List<String> construct = null;

        if (targetString.isEmpty()) return new LinkedList<>();

        for (String word:
                words) {
            if (targetString.startsWith(word)) {
                String newTarget = targetString.replace(word, " ").trim();
                if (construct == null ) {
                    construct = allCombinations(newTarget, words);
                } else {
                    construct.addAll(allCombinations(newTarget, words));
                }
                construct.add(word);
            }
        }


        return construct;
    }
}
