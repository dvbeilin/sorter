package com.sparta;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    static Sorter bubble=new BubbleSort();
    static Sorter merge = new MergeSort();
    static Sorter binary = new BinarySort();


    @Test//test three algorithms giving the same result
    public void testEquals(){
        for (int i=0;i<1000; i++) {
            int[] arr = RandArr.randArr(i,100);
            int[] arr1 = bubble.sortArray(arr);
            int[] arr2 = merge.sortArray(arr);
            int[] arr3 = binary.sortArray(arr);
            Arrays.sort(arr);
            assertArrayEquals(arr,arr1);
            assertArrayEquals(arr,arr2);
            assertArrayEquals(arr,arr3);
        }
    }

    @Test
    public void testSort(){
        for (int i=0;i<1000; i++) {
            int[] arr = RandArr.randArr(i,100);
            int[] arr1 = bubble.sortArray(arr);
            int[] arr2 = merge.sortArray(arr);
            int[] arr3 = binary.sortArray(arr);

            for (int c=0;c<i-1;c++){
                assertTrue(arr1[c]<=arr1[c+1]);
                assertTrue(arr2[c]<=arr2[c+1]);
                assertTrue(arr3[c]<=arr3[c+1]);
            }

    }
    }

    @Test//test to check if zero arrays break the program
    public void testZero(){
        int[] empty=new int[0];
        assertArrayEquals(empty,bubble.sortArray(empty)); assertArrayEquals(empty,merge.sortArray(empty));assertArrayEquals(empty,binary.sortArray(empty));
    }



    //testing the merge function
    @Test//test for merging equal size arrays
    public void testMerge(){
        Random rd = new Random(); // creating Random object
        int[] arr1 =new int[1000];
        int[] arr2 =new int[1000];

        arr1[0]=rd.nextInt(); arr2[0]=rd.nextInt();

        for (int i=1;i<1000;i++){
            arr1[i]=arr1[i-1]+rd.nextInt(1000);
            arr2[i]=arr2[i-1]+rd.nextInt(1000);
        }

        int[] arrOut=Merger.merge(arr1,arr2);
        int[] arrSorted=arrOut.clone();
        Arrays.sort(arrSorted);
        assertArrayEquals(arrOut,arrSorted);
    }
}