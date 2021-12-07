package com.company;

public class ArrayIDTest {
    public static void main(String[] args) {
       int[] numbers = {1,2,3,4,5};
        System.out.print("{ ");
       for(int i=0;i<numbers.length;i++){

           String comma =" ,";
           if (i == numbers.length-1){
               comma="";
           }
           System.out.print(numbers[i]+comma);
       }
        System.out.println(" }");
    }
}
