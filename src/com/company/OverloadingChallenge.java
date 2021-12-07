package com.company;

public class OverloadingChallenge {
    public static int area(int length ,int width){
        return length*width;
    }
    public static int area(int length){
        return length*length;
    }
    public static double area(double r){
        return r*r*Math.PI;
    }
    public static double area(double length,double breadth,double height){
        return (length+breadth)*0.5*height;
    }

    public static void main(String[] args) {
        System.out.println("the area of rectangle " + area(12,3));
        System.out.println("the area of square " + area(12));
        System.out.println("the area of circle " + area(12d));
        System.out.println("the area of trapezium  "+ area(12,14,9));
    }

}
