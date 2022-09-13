package com.sparta;

import java.util.Arrays;

/*
import org.junit.jupiter.api.Test;
import org.testng.annotations.Test;


import static org.junit.jupiter.api.Assertions.*;
*/
public class Main {


    public static void main(String[] args) {

        Sorter bubble=new bubbleSort();
        Sorter merge = new mergeSort();

        int[] arr=randArr.randArr(7);
        System.out.println(Arrays.toString(arr));
        int[] arr1= bubble.sortArray(arr);
        int[] arr2= merge.sortArray(arr);
       //ystem.out.println(Arrays.toString(arr1));System.out.println(Arrays.toString(arr2));
        /*
        for (int i=0; i<1000;i++){
            int[] arr=randArr.randArr(i);
            System.out.println(Arrays.toString(arr));
            int[] arr1= bubble.sortArray(arr);
            int[] arr2= merge.sortArray(arr);
            System.out.println(Arrays.toString(arr1));System.out.println(Arrays.toString(arr2));
            boolean ok=true;
            for (int j=0; j<i;j++){
                if (arr1[j]!=arr2[j])ok=false;}
            if (ok) System.out.println("test for equal sized array passed");
            else {System.out.println("test for equal sized arrays failed");System.out.println(Arrays.toString(arr1));System.out.println(Arrays.toString(arr2));return;}
        */}


    }

