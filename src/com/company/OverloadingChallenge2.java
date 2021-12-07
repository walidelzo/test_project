package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class OverloadingChallenge2 {
    //253
    //352
    static int reverse(int number){
        int newNumber=0;
        while(number!=0){
            newNumber = newNumber*10 + number%10;
            number = number/10;
        }
        return newNumber;
    }


    static int [] reverseArray(int arr[]){
        int [] newArray = new int[arr.length];
        for(int i = arr.length-1;i>=0;i--){
           newArray[arr.length-i-1] = arr[i];
        }
       return newArray;
    }
    static boolean validName(String name){
       return name.matches("[a-zA-Z\\s]{3,10}");
    }
    static boolean validAge(int age){
            return (age>3&&age<10);
    }

    public static void main(String[] args) {
        System.out.println(reverse(541));
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(reverseArray(arr)) );
        System.out.println(validName("wfsdfyyumnb"));
        System.out.println(validAge(5));
    }
}
