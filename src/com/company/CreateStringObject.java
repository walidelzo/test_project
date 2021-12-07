package com.company;

import java.util.Arrays;

public class CreateStringObject {
    public static void main(String[] args){
        char[] chars = {'w','a','l','i','d'};
        String str ="Hello ";
        String str2= new String("new String");
        System.out.println(chars);
        System.out.println(str + new String(chars));
    }
}
