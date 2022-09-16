package com.sparta;

import java.util.Objects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Factory {

    public static Sorter factory(){

        String sort= ViewLibrary.getValidString();
        if (Objects.equals(sort, "bubble sort")){
            return new BubbleSort();
        }
        else if (sort.equals("binary sort")){
            return new BinarySort();
        }
        else{
            return new MergeSort();
        }

    }
}
