package com.sparta;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Random;

public class RandArr {
    public static Logger logger= LogManager.getLogger(Starter.class);

    public static int[] randArr(int j, int bound) {
        logger.info("randArr method started (method to generate random array)");
        Random rd = new Random(); // creating Random object
        int[] arr = new int[j];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(bound); // storing random integers in an array
        }
        return arr;
    }

}