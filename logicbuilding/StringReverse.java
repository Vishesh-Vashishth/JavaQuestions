package com.Vishesh.logicbuilding;

import java.util.Scanner;

// first last index ko badalte rhege jabtak first last s bda na hojaye;
public class StringReverse {
    public static void main(String[] args) {
        System.out.print("Enter word you want to reverse : -----> ");
        Scanner in = new Scanner(System.in);
        String word = in.next();
        char[] chars = word.toCharArray();
        char[] revword = reverse(chars);
        System.out.println(revword);
    }
    public static char[] reverse(char[] word){
        char temp;
        int first = 0;
        int last = word.length-1;
        while(first<last){
            //swap first and last
            temp = word[last];
            word[last] = word[first];
            word[first] = temp;
            first++;
            last--;
        }
        return (word);
    }
}
