package com.sparta;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.ArrayList;

public class ViewManager {
    public static Logger logger= LogManager.getLogger(Starter.class);

    public static int[] getArray(){
        logger.info("Starting to generate array");

        System.out.println("Press 0 if you would like to enter an array, or 1 if you would like to generate it");
        int temp=ViewLibrary.getValidBool();
        if (temp==0){
            return (readInputArray());
        }
        else return generateArray();
    }

    public static int[] generateArray(){
        System.out.println("Enter the array length");
        int len = ViewLibrary.getValidInteger();
        System.out.println("Enter array value bound");
        int val = ViewLibrary.getValidInteger();

        return RandArr.randArr(len,val);
    }


    public static int[] readInputArray() {
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
}
