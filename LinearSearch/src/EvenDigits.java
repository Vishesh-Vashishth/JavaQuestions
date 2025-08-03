// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums){
            if (Even(num)){
                count++;
            }
        }
        return count;
    }

    static boolean Even(int num) {
        int NumberOfDigits = digits(num);
        return NumberOfDigits % 2 == 0 ;
    }

    static int digits(int num) {
        if(num<0){
            return num*(-1);
        }

        if (num == 0){
            return 1;
        }

        int count = 0 ;
        while (num > 0){
            count ++;
            num = num/10;
        }
        return count;
    }
}
