package com.sparta;

import java.util.Arrays;

public class bubbleSort implements Sorter{
    public int[] sortArray(int[] integers){
        if (integers.length==0||integers.length==1)return integers;
        int[] ints =integers.clone();
        int len=ints.length;
        boolean swaps=false;
        int j=len-1;
        while (!swaps){
            swaps=false;
            for (int i=0;i<j;i++){

                if (ints[i+1]<ints[i]){
                    int temp=ints[i];
                    ints[i]=ints[i+1];
                    ints[i+1]=temp;
                    swaps=true;
                }
                System.out.println(Arrays.toString(ints));

            }
            j--;
            if (j==1)swaps=false;
            System.out.println(Arrays.toString(ints));
        }
        return ints;
    }
}
