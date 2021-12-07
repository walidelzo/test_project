package com.company;



public class StringMethods1 {
     static int x= 10;
    public static void main(String[] args){
        String str = "  welcome to my house  ";
        int length = str.length();
        System.out.println(length);
        String str1="JAVA";
        System.out.println(str1.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.printf("%-32s","Ali\n");
        System.out.println(str);
         str = "saad".substring(1);
         str = "I like Java Programming language".substring(2,6);
        System.out.println(str);
        str = "i like python programming language tt programming language bb ".replace("python" ,"java");
        System.out.println(str);
        boolean theContextContainIOrNot = str.contains("i");
        if (theContextContainIOrNot) System.out.println("true"); else System.out.println("false");
        String str11=str.replaceAll("programming language","-");
        System.out.println(str11);
        char charIndex="programming language ".charAt(0);
        System.out.println(charIndex);
        int indexOfP = "Programming Language".indexOf('a');
        System.out.println(indexOfP);
        int indexOfP2 = "Programming Language".indexOf("Language");
        System.out.println(indexOfP2);
        String str22 = "H";
        String str23 = "h";
        System.out.println(str22.equals(str23));
        String str24 = new String("hello");
        System.out.println(str22==(str24));
        System.out.println(str23.compareToIgnoreCase(str22));
        System.out.println(str23.compareTo(str22));
       int H = 'H', h='h';
        System.out.println(H);
        System.out.println(h);
        System.out.println(h-H);
        str22 = "i like python programming language tt programming language bb ".valueOf('i');
       x= x++;
        System.out.println(str22);
        System.out.println(x);

    }
}
