package com.sparta;

import java.util.Random;

public class RandArr {
    public static int[] randArr(int j, int bound) {
        Random rd = new Random(); // creating Random object
        int[] arr = new int[j];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(bound); // storing random integers in an array
        }
        return arr;
    }

}