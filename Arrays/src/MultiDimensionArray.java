import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[2][2];
        for(int row = 0 ; row < arr.length ; row++){
            for (int col = 0 ; col < arr[row].length ; col++){
                arr[row][col] = in.nextInt();
            }
        }

        for(int row = 0 ; row < arr.length ; row++){
            for (int col = 0 ; col < arr[row].length ; col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println(); // new line me aajega isse jab ek row finish hogi
        }


    }

}


// arr[row].length no. of col aajege
// arr.length se no. of rows aajegi