package com.company;

public class RegularExpressionDemo {
    public static void main(String[] args) {
        //this is symbols matches regular expression
        String expression = "a";
        System.out.println(expression.matches("[a-d]"));
        System.out.println(expression.matches("[^abc]"));
        System.out.println(expression.matches("."));
        System.out.println(expression.matches("a|b"));
        System.out.println(expression.matches("ZX"));
        System.out.println("========================");
        //this meta characters in regular expression
        String metaExp = " ";
        System.out.println(metaExp.matches("\\d"));
        System.out.println(metaExp.matches("\\D"));
        System.out.println(metaExp.matches("\\w"));
        System.out.println(metaExp.matches("\\W"));
        System.out.println(metaExp.matches("\\s"));
        /// this is quantifiers in regular expression
        System.out.println("-------------------------");
        String str = "hello";
        System.out.println(str.matches("[ll]+"));
        System.out.println(str.matches("[l]*"));
        System.out.println(str.matches("[a-z]*"));
        String email ="test8888_@gml.co";
        System.out.println("===========================");
        System.out.println(email.matches("[a-z]{4}[0-9]{4}\\w{1,3}@[a-z]{2,9}.[a-z]{2,3}"));
    }
}
