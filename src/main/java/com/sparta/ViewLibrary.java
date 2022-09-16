package com.sparta;

import java.util.Objects;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class ViewLibrary {
    public static Logger logger= LogManager.getLogger(Starter.class);

    public static int getValidInteger(){
        logger.info("in the getValidInteger method");
        boolean validInput=false;
        int out = 0;
        Scanner myObj = new Scanner(System.in);

        while (!validInput) {
            try {
                out = myObj.nextInt();
                validInput=true;
            } catch (Exception e) {
                System.out.println("enter an integer");
            }
        }
        return out;
    }

    public static int getValidBool(){
        logger.info("int the getValidBool method");
        boolean validInput=false;
        int out=0;
        Scanner myObj = new Scanner(System.in);

        while (!validInput) {
            try {
                out = myObj.nextInt();
                if (out==0|| out==1){
                    validInput=true;}
            } catch (Exception e) {
                System.out.println("Enter 0 or 1");
            }
            finally {
                if (!validInput) System.out.println("Enter 0 or 1");

            }
        }
        return out;
    }
    public static String getValidString(){
        logger.info("in the getValidString method");
        boolean validInput=false;
        String out=null;
        Scanner myObj = new Scanner(System.in);

        while (!validInput) {
            try {
                out = myObj.nextLine().toLowerCase();
                if (Objects.equals(out, "binary sort")|| Objects.equals(out, "bubble sort")||Objects.equals(out,"merge sort")){
                validInput=true;}
            } catch (Exception e) {
                System.out.println("enter a string");
            }
            finally {
                if (!validInput)  System.out.println("Enter a name of a sorting algorithm");

            }
        }
        return out;
    }
}
