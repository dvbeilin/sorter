package com.sparta;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Arrays;

import static com.sparta.ViewManager.generateTest;

public class Starter {
    public static Logger logger= LogManager.getLogger(Starter.class);

    public static void start(){

        int[] arr=ViewManager.getArray();
        System.out.println("the array is: "+ Arrays.toString(arr));
        Sorter sort;

        System.out.println("Which sort would you like to use?");

        String algorithm=ViewLibrary.getValidString();
        if (algorithm.equals("bubble sort")){
            sort=new BubbleSort();
            logger.info("We chose bubble sort");
        }
        else if (algorithm.equals("merge sort")){
            sort=new MergeSort();
            logger.info("We chose merge sort");
        }
        else {
            sort =new BinarySort();
            logger.info("We chose binary sort");

        }

        int[] arrOut =sort.sortArray(arr);
        System.out.println("Sorted Array is  "+ Arrays.toString(arrOut));


        generateTest(arr);




    }
}
