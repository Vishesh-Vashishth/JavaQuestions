package com.Vishesh.logicbuilding;

public class Triangle {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i <= n ; i++) {
            for (int j = 1; j < n-i; j++) {
                System.out.print(" ");

            }
            for (int j = 0; j < 2*i-1 ; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}




//       *    n = 5(row)  i = 1 , i<=n , i++ ; j
//      * *
//     * * *
//    * * * *
//   * * * * *