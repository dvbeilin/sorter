package com.sparta;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;

public class Merger {
    public static Logger logger= LogManager.getLogger(Starter.class);

    public static int[] merge(int[] arr1, int[] arr2){

        ArrayList<Integer> outList = new ArrayList<>();
        boolean merged=false;
        logger.trace("merger method started");

        int len1=arr1.length; int len2=arr2.length;
        int c1=0; int c2=0; //counter variables


        while (!merged){
            if (c1==len1 || c2==len2){
                while (c1<len1){
                    outList.add(arr1[c1]);
                    c1++;
                }
                while (c2<len2){
                    outList.add(arr2[c2]);
                    c2++;
                }
                if (c1==len1&&c2==len2) merged=true;
            }
            else {
                if (arr1[c1]<arr2[c2]){
                    outList.add(arr1[c1]);
                    c1++;
                }
                else{
                    outList.add(arr2[c2]);
                    c2++;
                }
            }

        }
        return outList.stream().mapToInt(i->i).toArray();

    }

}
