package com.company;

public class InsertingInArray {
    public static void main(String[] args){
        //Program to inserting into an array
        int A[]=new int [10];
        A[0]=1;
        A[1]=2;
        A[2]=4;
        A[3]=5;
        A[4]=6;
        A[5]=7;
        for(int a:A){
            System.out.print(a + " ");
        }
        System.out.println("");
        for(int i=A.length-1;i>0;i--){
            A[i]=A[i-1];
            if(i==2){
              A[2]=3;
              break;
            }
        }
        for(int a:A){
            System.out.print(a + " ");
        }
    }
}
