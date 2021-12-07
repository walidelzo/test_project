package com.company;

import java.util.Scanner;

public class TriangleArea1 {
    public static void main(String args[]){
        Scanner scannedInput = new Scanner(System.in);
        System.out.println("Enter the Base of the triangle..");
        int triangleBase = scannedInput.nextInt();
        System.out.println("Enter the height of the triangle ..");
        int triangleHeight = scannedInput.nextInt();
        float theArea = (triangleHeight*triangleBase) / 2;
        System.out.println("the area of this triangle is " + theArea);
    }

}
