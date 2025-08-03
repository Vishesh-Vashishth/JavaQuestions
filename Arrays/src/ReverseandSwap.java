import java.util.Arrays;

public class ReverseandSwap {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
//        swapindex(arr,4 ,2);
//        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            swapindex(arr,start,end);
            start++;
            end--;
        }
    }

    static void swapindex(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
