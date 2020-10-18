/*
***********************************************************

Topic   : Program to demonstrate SPLIT function in java.
Author  : Chpaone09®
Date    : Oct 18, 2020

************************************************************
*/

public class SPLIT{
    public static void main(String[] args) {
        String a = "5,4,10,6,25,60";
        String[] arr = new String[10];

        arr = a.split(",");

        for(int i=0;i<arr.length;i++){
            System.out.print("\n\n\t value at "+i+" of arr >> "+arr[i]);
        }
    }
}