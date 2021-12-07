package com.company;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main (String[] args){
        int a,b,c;
        double r1,r2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the a : ");

        a = sc.nextInt();
        System.out.println("Enter the b : ");
        b = sc.nextInt();
        System.out.println("Enter the c");
        c = sc.nextInt();
        double sqrt = Math.sqrt((Math.pow(b, 2) - (4 * a * c))) ;
        r1 = (-b + sqrt)/ (2*a);
        r2 = (-b - sqrt)/ (2*a);
        System.out.println("the r1 is " + r1 + " and the r2 is " + r2);

    }
}
