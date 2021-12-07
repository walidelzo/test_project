package com.company;

public class ArrayChallenge2 {
    public static void main(String[] args) {
        int numbers[]={1,2,3,4,8,7,10,4};
        //right shift modification
        int newArray[]=new int[numbers.length];
        for(int i=0;i<numbers.length;i++){
            if((i+1)<numbers.length){
                newArray[i] =numbers[i+1];
            }
        }
        newArray[newArray.length-1]=numbers[0];
        for(int number:newArray){
            System.out.print(number+" ");
        }
        System.out.println("");
        int newArray1 []= new int[numbers.length];

        for(int i=1;i<numbers.length;i++){
            newArray1[i]=numbers[i-1];
        }
        newArray1[0] = numbers[numbers.length-1];
        for(int number:newArray1){
            System.out.print(number + " ");
        }
        System.out.println("\n--------");
        //---------- right shift the same array ----
        int A[] = {1,2,3,4,5,6,7,8,9};
        for(int a:A){
            System.out.print(a+" ");
        }
        int temp = A[0];
        for(int i=1;i<A.length;i++){
              A[i-1]=A[i];
        }
        A[A.length-1] = temp;
        System.out.println("");
        for(int a:A){
            System.out.print(a+" ");
        }
        System.out.println("\n***************");
        //-------left shift------------
        int B[]={1,3,5,7,9,11,13,15};
        temp = B[0];
        for(int b:B){
            System.out.print(b+" ");
        }
        System.out.println("");
        for(int i=0;i<B.length-1;i++){
           B[i] =B[i+1];
        }
        B[B.length-1]=temp;
        for(int b:B){
            System.out.print(b+" ");
        }

    }
}
