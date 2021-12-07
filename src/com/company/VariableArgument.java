package com.company;

public class VariableArgument {
    static void printTo(int...x){
        for(int a:x){
            System.out.println(a);
        }
    }
    static void show(int index,String ... names){
        index=1;
        for(String name:names){
            System.out.println(index + "." +  name);
            index++;
        }
    }

    public static void main(String[] args) {
        printTo(12,14,16,78,96,47);
        show(1,"walid","yaseen","mahmoud","ahmed");
    }
}
