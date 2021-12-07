package com.company;
import java.util.Scanner;
public class TestMethod {
   static int max(int n1,int n2){
        if (n1>n2)
            return n1;
        else
            return n2;
    }
    public static void main(String[] args) {
        System.out.println("Enter the numbers ");
        Scanner sc= new Scanner(System.in);
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=max(a,b);
        System.out.println("the max number is :"+c);
    }

}
