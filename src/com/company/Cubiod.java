package com.company;

import java.util.Scanner;

public class Cubiod {
    public static void main(String[] args){
        int width,height,breadth,rightAndLeft,topAndBottom,frontAndRear,theTotalArea,theTotalArea2;
        System.out.println("this program help you to calculate the cuboid " +
                "\n==========================================================");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height");
        height = sc.nextInt();
        System.out.println("Enter the width");
        width = sc.nextInt();
        System.out.println("Enter the breadth");
        breadth = sc.nextInt();
        rightAndLeft = height * breadth * 2 ;
        topAndBottom = width * height * 2 ;
        frontAndRear = height * width * 2 ;
        theTotalArea = frontAndRear + topAndBottom + rightAndLeft;
        System.out.println("the total area is : " + theTotalArea);
        theTotalArea2 = width * breadth * height;
        System.out.println("the total area2 is " + theTotalArea2);


    }

}
