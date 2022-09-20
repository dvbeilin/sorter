package com.sparta;

import java.util.Objects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Factory {
    public static Logger logger= LogManager.getLogger(Starter.class);

    public static Sorter factory(int i ){
        logger.trace("Factory method started");


        if (i==0){
            logger.trace("Factory created bubble sort");
            return new BubbleSort();
        }
        else if (i==1){
            logger.trace("Factory created binary sort");
            return new BinarySort();
        }
        else if (i==2){
            logger.trace("Factory created merge sort");
            return new MergeSort();
        }
        else {
            logger.fatal("factory got an integer that was not 0, 1 or 2");
            return null;
        }

    }
}
