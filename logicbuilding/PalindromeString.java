package com.Vishesh.logicbuilding;

import java.util.Scanner;

// first last index ko badalte rhege jabtak first last s bda na hojaye;
public class PalindromeString {
    public static void main(String[] args) {
        System.out.print("Enter word you want to check for palindrome : -----> ");
        Scanner in = new Scanner(System.in);
        String word = in.next();
        char[] chars = word.toCharArray();
        boolean answer = isPalindrome(chars);
        System.out.println(answer);
    }
    public static boolean isPalindrome(char[] word){
        char temp;
        int first = 0;
        int last = word.length-1;
        while(first<last){
            // first or last equal h ya nahi y check karte jayege
            if (word[first]!= word[last]){
                return false;
            }
            first++;
            last--;
        }
        return true;
    }
}

