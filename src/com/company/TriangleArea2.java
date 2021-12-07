package com.company;

import java.util.Scanner;

public class TriangleArea2 {
    public static void main(String[] args) {
        float a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first side  ");
        a = sc.nextInt();
        System.out.println("Enter the second Side");
        b = sc.nextInt();
        System.out.println("Enter the third Side");
        c = sc.nextInt();
        double semi_perimeter = (a+b+c) / 2;
        double newResult = semi_perimeter*((semi_perimeter-a) + (semi_perimeter-b) + (semi_perimeter-c));
        double theTriangleArea = Math.sqrt(newResult);
        System.out.println(theTriangleArea);
    }
}
