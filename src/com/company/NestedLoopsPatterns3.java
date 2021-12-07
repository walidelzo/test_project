package com.company;

public class NestedLoopsPatterns3 {
    public static void main(String[] args) {
        for(int i =1 ;i<=6;i++){
            for (int j = 1; j <=6 ; j++) {
                if (j>=i)
                   System.out.print( "* ");
                else
                    System.out.print("  ");
            }
            System.out.println("");
        }
        System.out.println("------------------------");
        for(int i =1 ;i<=6;i++){
            for (int j = 6; j >=1 ; j--) {
                if (j>=i)
                    System.out.print( "  ");
                else
                   System.out.print( "* ");

            }
            System.out.println("");
        }
        System.out.println("-------------------");
        for (int i = 1; i <= 11; i=i+2) {
            for (int j = i; j >=1 ; j--) {
                   System.out.print(" "+j);
            }
            System.out.println("");
        }
        for (int i = 1; i <= 11; i=i+2) {
            for (int j = i; j <=11 ; j++) {
                System.out.print(" "+j);
            }
            System.out.println("");
        }
        for(int i=1;i<5;i++)
        {
            for(int j=1;j<5;j++)
            {
                if(i+j>5)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println("");
        }
    }
}
