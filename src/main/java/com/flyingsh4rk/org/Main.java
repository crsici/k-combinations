package com.flyingsh4rk.org;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello k combination");
        List<Integer> input = Arrays.asList(1, 2, 3);

        List<List<Integer>> output = new ArrayList();
        kCombination(input, 3,null, output);

        System.out.println(Arrays.toString(output.toArray()));
    }

    public static void kCombination(List<Integer> input, Integer k, List<Integer> cache, List<List<Integer>> output) {
        if ((cache != null && cache.size() == k)) {
            output.add(cache);
            return;
        }
        if (input.size() == 0)
            return;
        for (int i = 0; i < input.size(); i++) {
            List<Integer> newCache = new ArrayList<>();
            List<Integer> newInput = new ArrayList<>(input);
            if (cache != null) {
                newCache.addAll(cache);
            }
            newCache.add(newInput.remove(i));

            kCombination(newInput, k, newCache, output);
        }
    }
}
