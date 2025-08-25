package com.Vishesh.logicbuilding;

public class VowvelsConsonentCount {
    public static void main(String[] args) {
        String str = "Hello See yaa!!";
        str = str.toLowerCase();
        int answer = vowvel(str.toCharArray());
        System.out.println(answer);
    }

    private static int vowvel(char[] charArray) {
        int vowels = 0;
        int consonent = 0;
        for(char c : charArray){
            if (c >= 'a' && c <= 'z'){
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ){
                    vowels++;
                }else {
                    consonent++;
                }
            }
        }
        return vowels;
    }

}
