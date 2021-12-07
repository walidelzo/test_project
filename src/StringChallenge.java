public class StringChallenge {
    public static void main(String[] args) {
        String str = "Hello mr Walid Elzohery , hi walid";
        //replace spaces with dashes
        String str2[] = str.split("\\s");
        System.out.println("the count of words is " + str2.length);
        System.out.println(str2);
        str = str.replaceAll(" " , "_");
        System.out.println(str);
        //number of l in the str variable
        str = "llllll";
        char[] AllLChar = str.toCharArray();
        int theNumberOFL = 0;
        for(int i =0 ; i<AllLChar.length;i++){
            if (AllLChar[i] =='l')
                theNumberOFL++;
        }
        System.out.println(theNumberOFL);
        //remove special character from the string
        str = "Ghello fromg Berlin ";
       str= str.replaceAll("[gG]","");
        System.out.println(str);
    }


}
