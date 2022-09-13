package com.sparta;


import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    static Sorter bubble=new bubbleSort();
    static Sorter merge = new mergeSort();


    @Test//test for equal size arrays
    public static void testEquals(){
        for (int i=0; i<1000;i++){
            int[] arr1=randArr.randArr(i);
            int[] arr2=randArr.randArr(i);
            assertEquals(bubble.sortArray(arr1),merge.sortArray(arr2));
        }

    }

}