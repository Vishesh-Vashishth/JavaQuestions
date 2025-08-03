//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       int[] nums = {1,4,2,5,7,16,77};
       int target = 77;
       int answer = whichIndex(nums,target);
       boolean answer2 = linearSearch3(nums,target);
        System.out.println(answer);
        System.out.println(answer2);
    }

    static int whichIndex(int[] arr, int target) {
        if(arr.length == 0){
            return -1;
        }
        for (int index = 0; index<= arr.length-1 ; index++){
            if(arr[index]== target){
                return index;
            }
        }
        return -1;
    }


    static boolean linearSearch3(int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }

        // run a for loop
        for (int element : arr) {
            if (element == target) {
                return true;
            }
        }
        // this line will execute if none of the return statements above have executed
        // hence the target not found
        return false;
    }

}