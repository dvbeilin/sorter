package com.sparta;

import java.util.Random;

public class randArr {
    public static int[] randArr(int j) {
        Random rd = new Random(); // creating Random object
        int[] arr = new int[j];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(100); // storing random integers in an array
        }
        return arr;
    }

}