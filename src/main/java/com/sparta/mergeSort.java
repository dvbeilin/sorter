package com.sparta;

import java.util.Arrays;

public class mergeSort implements Sorter{
    public int[] sortArray(int[] ints){
        int len=ints.length;
        if (len==0||len==1){
            return ints;
        }
        else {
            int[] arr1= Arrays.copyOfRange(ints, 0, len/2);
            int[] arr2= Arrays.copyOfRange(ints, len/2, len);
            return merger.merge(arr1,arr2);

        }

    }
}
