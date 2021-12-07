
package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberOfWordsInString {
    public static void main(String[] args) {
        String str = "Hello walid How go are you go walid walid is active";
        String allWords[] = str.split(" ");
        //System.out.println(Arrays.toString(allWords));
        List<String> list = new ArrayList<String>();
        int count =0;
        for (int i=0;i<allWords.length;i++){
            for(int c =0;c<allWords.length;c++){
                if (allWords[i].equals(allWords[c])){
                    count++;
                }
            }
            if (count>1)
            list.add(allWords[i]);
            count = 0;
        }
        System.out.println(list);
    }
}
