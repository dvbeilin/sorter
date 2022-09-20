package com.sparta;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.ArrayList;

import static java.lang.System.currentTimeMillis;

public class ViewManager {
    public static Logger logger= LogManager.getLogger(Starter.class);

    public static int[] getArray(){
        logger.info("Starting to create an array");

        System.out.println("Press 0 if you would like to enter an array, or 1 if you would like to generate it");
        int temp=ViewLibrary.getValidBool();
        if (temp==0){
            return (readInputArray());
        }
        else return generateArray();
    }

    public static int[] generateArray(){
        logger.info("User chose to generate array");

        System.out.println("Enter the array length");
        int len = ViewLibrary.getValidInteger();
        System.out.println("Enter array value bound");
        int val = ViewLibrary.getValidInteger();

        return RandArr.randArr(len,val);
    }


    public static int[] readInputArray() {
        logger.info("User chose to input array");

        ArrayList<Integer> outList = new ArrayList<Integer>();
        System.out.println("Enter the array length");
        int len = ViewLibrary.getValidInteger();
        System.out.println("Start entering integers to populate array");
        for (int i = 0; i < len; i++) {
            outList.add(ViewLibrary.getValidInteger());
        }
        System.out.println("Array created. Here is your array:");
        System.out.println(outList);

        return outList.stream().mapToInt(i -> i).toArray();
    }

    public static void generateTest(int[] arr) {
        System.out.println("Press 1 if you would like to compare the sorting algorithms for this array, press 0 otherwise");
        int bool = ViewLibrary.getValidBool();
        if (bool==1){
            logger.info("comparing algorithms");
            double[] sortTimes=new double[]{0,0,0};
            int j=1000;//amount of repetitions
            double time=0.0;
            double time1; double time2;
            for(int s=0; s<3;s++){
                for (int i=0; i<j; i++){
                    Sorter algorithm =Factory.factory(s);
                    time1=currentTimeMillis();
                    algorithm.sortArray(arr);
                    time2=currentTimeMillis()-time;
                    sortTimes[s]=sortTimes[s]+(time2-time1)/j;
                }

            }
            System.out.println("Bubble sort took  " + sortTimes[0] + " ms");
            System.out.println("Binary sort took  " + sortTimes[1] + " ms");
            System.out.println("Merge sort took  " + sortTimes[2] + " ms");
        }
    }
}
