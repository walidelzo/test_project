package com.company;

public class Increment {
    public static void main(String[] args) {
        int x =5 ,y=4 ,z;
        z=3*++x + 2*++y;
        System.out.println("z :" + z);
        float f = 4.5f;
        f=f + 2f;
        char c = 'A';
        ++c;
        byte b=12;
        b++;
        System.out.println(f);
        System.out.println(c);
        System.out.println(b);
    }

}
