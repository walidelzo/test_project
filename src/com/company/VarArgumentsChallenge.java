package com.company;

import java.util.Arrays;

public class VarArgumentsChallenge {
    static int max (int...numbers){
        if(numbers.length==0) return Integer.MAX_VALUE;
        int max = numbers[0];
        for(int number:numbers){
            if(number>max)
                max=number;
        }
        System.out.println(max);
        return max;
    }
    static void sum(int ... numbers){
        int sum=0;
        for(int number:numbers){
            sum=sum+number;
        }
        System.out.println(sum);
    }
    public static void discount(double discountValue,double ...prices){
        double[] newPrices = new double [prices.length];
        for(int i=0 ;i < prices.length;i++){
           // prices[i] = prices[i]*discountValue;
            newPrices[i]= prices[i]- prices[i]*discountValue;
            System.out.println(prices[i]);
            System.out.println("------------------------");
            System.out.println(Arrays.toString(newPrices));
        }
    }

    public static void main(String[] args) {
        int [] numbers = {18,47,20,87};
        sum();
        sum(1,91,8);
        sum(numbers);
        max(12,19,88,2);
        discount(.25,200,1000,2000);

    }
}
