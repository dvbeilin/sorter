package com.sparta;

public class BubbleSort implements Sorter {
    public int[] sortArray(int[] integers) {
        if (integers.length == 0 || integers.length == 1) return integers;
        int[] ints = integers.clone();
        int len = ints.length;
        boolean swaps = true;
        int j = len - 1;
        while (swaps) {
            swaps = false;
            for (int i = 0; i < j; i++) {

                if (ints[i + 1] < ints[i]) {
                    int temp = ints[i];
                    ints[i] = ints[i + 1];
                    ints[i + 1] = temp;
                    swaps = true;
                }

            }
            j--;
        }
        return ints;
    }
}
