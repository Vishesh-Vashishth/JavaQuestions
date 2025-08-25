package com.Vishesh.logicbuilding;

public class Diamond {
    public static void main(String[] args) {
        int n = 4 ;
        for (int i = 1; i <= n ; i++) {
            for (int space = 0; space < n-i ; space++) System.out.print(" ");
            for (int star = 0; star < 2*i-1 ; star++) System.out.print("*");
            System.out.println();
        }

        for (int i = n; i >= 0 ; i--) {
            for (int space = 0; space < n-i ; space++) System.out.print(" ");
            for (int star = 0; star < 2*i-1 ; star++) System.out.print("*");
            System.out.println();
        }
    }
}
