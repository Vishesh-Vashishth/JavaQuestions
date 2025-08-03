import java.lang.reflect.Array;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {2,4,3,67,54,78,65};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    static int GetIndex(int[] arr, int start , int last){
        int maxindex = start;
        for (int i = start+1; i <= last ; i++) {
            if (arr[i]>arr[maxindex]){
                maxindex = i;
            }
        }
        return maxindex;
    }

    static void swap(int[] arr, int first , int second){
        int temp = arr[first];
        arr[first]= arr[second];
        arr[second]= temp;
    }
    
    static void selection(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - 1 - i; // shrink sorted portion from right;
            int maxindex = GetIndex(arr,0,last);
            swap(arr,maxindex,last);

        }
    }
}
