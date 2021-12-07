package com.company;

public class SumNum {
    public static void main(String[] args) {
        args = new String[]{"1", "2", "4", "6"};
        double sum =0;
        for(String arg:args){
            if(arg.matches("[1-9\\.]*")){
                sum=sum+ Double.parseDouble(arg);
            }
        }
        System.out.println(sum);
    }
}
