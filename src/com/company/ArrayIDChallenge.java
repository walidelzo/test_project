package com.company;

import java.util.Scanner;

public class ArrayIDChallenge {
    public static void main(String[] args) {
        //program to sum the one diminution array
       int numbers[]={3,9,7,8,12,99,400,6,15,5,4,10,102};
//        int sum=0;
//        for(int x:numbers){
//            sum=sum+x;
//        }
//        System.out.println("the sum is "+sum);
//        //program to search for an element in an array
//        System.out.println("enter the element");
//        Scanner sc = new Scanner(System.in);
//        int element =sc.nextInt();
//        boolean found=false;
//        for(int x:numbers){
//            if (x==element) {
//                found = true;
//                break;
//            }else
//                found = false;
//        }
//         if(found) System.out.println("yes there are"); else System.out.println("not found");
//        //program to find maximum number
//        int max =0;
//        for(int arr:numbers){
//            if(arr>max)
//                max =arr;
//        }
       // 1.6.3.4.7
//        System.out.println("the max is : "+max);
        int max1=0;
        int max2=0;
        for(int number:numbers){
            if(number>max1){
                max2=max1;
                max1=number;
            }else if (number > max2){
                max2=number;
            }
        }
        System.out.println("the largest numbers are : " +  max1 + " and " + max2 );
    }

}
