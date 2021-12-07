package com.company;

public class RegularExpressionChallenge {
    public static void main(String[] args) {
        //make sure the input binary number
        String input = "011101";
        System.out.println(input.matches("[0-1]*"));
       //make sure the input hexadecimal
        input = "0x2B2";
        System.out.println(input.matches("0x[0-9A-F]+"));
        //make sure the input is Octal numbers
        input  = "015";
        System.out.println(input.matches("[0-8]+"));
        // make sure "dd/mm/yyyy"
        input = "12/19/2010";
        System.out.println(input.matches("[0-3][0-9]/[0-1][0-9]/[0-9]{4}"));


    }
}
