package com.company;

public class ReverseCopyOfArray {
    public static void main(String[] args){
        int a[] = {1,44,34,5,22,4,14,6,77,90,0};
        System.out.println(a.length);
        int min =a[0];
        for(int ar:a){
            if (ar<min){min=ar;}
        }//KB153825
        System.out.println(min);
    }
}
