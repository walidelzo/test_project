package com.company;

public class NestedLoop {
    public static void main(String[] args) {
        System.out.println("program ");
        for(int i=1;i<=5;i++){
           for(int j=1;j<=5;j++){
               System.out.print("| ("+i + "," + j+") ");
           }
            System.out.println("");
        }

    }
}
