package org.example.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class BacktrackingMain {

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        List<List<Integer>> result = subsets(array);

        for (List<Integer> subset : result) {
            System.out.println(subset.toString());
        }
    }

    public static List<List<Integer>> subsets(int[] array) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();

        createSubsets(array, 0, result, subset);
        return result;
    }

    public static void createSubsets(int[] array, int index, List<List<Integer>> result, List<Integer> subset) {
        if (index == array.length) {
            result.add(new ArrayList<>(subset));
            return;
        }

        subset.add(array[index]);
        createSubsets(array, index + 1, result, subset);

        subset.removeLast();
        createSubsets(array, index + 1, result, subset);
    }
}
