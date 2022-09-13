package com.sparta;

public class binarySort implements Sorter{

    public int[] sortArray(int[] arrayToSort) {
        treeNode root = new treeNode(arrayToSort[0],null);

        for (int i=1; i<arrayToSort.length; i++ ){
            root.addData(arrayToSort[i]);
        }

        int[] sortedArray=new int[arrayToSort.length];



        for (int i=0; i<arrayToSort.length; i++){
            //sortedArray[i]
        }

        return new int[0];
    }
}
