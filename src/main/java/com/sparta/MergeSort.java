package com.sparta;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class MergeSort implements Sorter{
    public static Logger logger= LogManager.getLogger(Starter.class);

    public int[] sortArray(int[] ints){
        int len=ints.length;
        if (len==0||len==1){
            logger.trace("merge sort base case reached");
            return ints;
        }
        else {
            int[] arr1= Arrays.copyOfRange(ints, 0, len/2);
            int[] arr2= Arrays.copyOfRange(ints, len/2, len);
            return Merger.merge(sortArray(arr1),sortArray(arr2));

        }

    }
}
