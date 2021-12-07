package com.company;

public class BitwiseOperator {
    public static void main(String[] args){
        int x =10;
        byte y = 9;
        int z=x&y;
        System.out.println("x&y ===>" + z);
        z= x|y;
        System.out.println("x|y ==>" +  z);
        z=x^y;
        System.out.println("z^y ====>" + z);
        z = x<<1;
        System.out.println("z<<1 ====> " + z);
        z= x>>1;
        System.out.println("z>>1  ====> " + z);
        z= x>>>2;
        System.out.println(" x>>>1 ===> "+z);
        z= ~x;
        System.out.println("~x====> " + z);
    }
}
