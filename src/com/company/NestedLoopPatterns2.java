package com.company;

public class NestedLoopPatterns2 {
    public static void main(String[] args) {
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+" , ");
            }
            System.out.println("");
        }
        int count=1;
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(count++ +" , ");
            }
            System.out.println("");
        }
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("============");
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=6-i ; j++) {
                System.out.print(j+ " ,");
            }
            System.out.println("");
        }
        System.out.println("============");
        int countt=1;
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=6-i ; j++) {
                System.out.print("*" + " ,");
            }
            System.out.println("");
        }
        System.out.println("============");
        int count1=1;
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=6-i ; j++) {
                System.out.format("%02d ",count1++);
            }
            System.out.println("");
        }
    }
}
