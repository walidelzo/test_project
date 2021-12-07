package com.company;

public class PrimeNumberFind {
    public static void main(String[] args) {
        int number = 5;
        System.out.println(isPrime(number)? " is prime":" not prime");
    }
    static boolean isPrime(int number){
        for(int i=2;i<10;i++){
            if(number%i==0&&i!=number){
                return false;
            }
        }
        return true;
    }
}
