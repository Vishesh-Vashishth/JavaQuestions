import java.util.Scanner;
import java.util.Arrays;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[5];

        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = in.nextInt();
        }

//        System.out.println(Arrays.toString(arr));

        for (int i = 0, arrLength = arr.length; i < arrLength; i++) {
            int j = arr[i];
            System.out.println(j);
        }
    }
}
