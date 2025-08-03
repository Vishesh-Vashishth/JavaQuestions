import java.util.Scanner;
import java.util.Arrays;

public class MaxValue {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,89,65};
//        System.out.println(max(arr));
        int ans = max(arr);
        System.out.println(ans);
    }

    static int max(int[] arr) {
        if(arr.length==0){
            return -1;
        }
        int maxvalue = arr[0];
        for (int i = 0 ; i < arr.length ; i++){
            if (arr[i] > maxvalue){
                maxvalue = arr[i];
            }

        }
        return maxvalue;
    }
}
