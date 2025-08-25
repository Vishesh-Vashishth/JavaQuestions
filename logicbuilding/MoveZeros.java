package com.Vishesh.logicbuilding;

public class MoveZeros {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        int count = 0; // Count non-zero elements

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i]; // Hindi: Non-zero elements ko aage rakhte hain
            }
        }

        // Fill remaining with zeros
        while (count < arr.length) {
            arr[count++] = 0;
        }

        for (int num : arr) {
            System.out.print(num + " "); // Output: 1 3 12 0 0
        }
    }
}
