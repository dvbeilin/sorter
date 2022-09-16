package com.sparta;

import java.util.ArrayList;

public class BinarySort implements Sorter{

    public int[] sortArray(int[] arrayToSort) {
        int len=arrayToSort.length;
        if (len==0){
            return arrayToSort;
        }
        TreeNode root = new TreeNode(arrayToSort[0],null);
        for (int i=1; i<len; i++ ){
            root.addData(arrayToSort[i]);
        }

        ArrayList<Integer> outList = root.getData();

        return outList.stream().mapToInt(i->i).toArray();
    }
}
