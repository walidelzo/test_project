package com.company;

public class PractiseObjectPassing {
    static void changeTheValue(int[]x,int index,int val){
        x[index]=val;
    }
    static void change(int oldVal,int newVal){
            oldVal=newVal;
    }

    public static void main(String[] args) {
        int[] A= {2,4,6,56,10};
       changeTheValue(A,3,8);
       change(A[0],7);
       for(int a:A){
           System.out.print(a + " ");
       }
    }
}
