public class FindMin {
    public static void main(String[] args) {
        int[] nums = {11,4,2,4,5,65,3,8,1,77};
        int ans = findMin(nums);
        System.out.println(ans);
    }
// suppose arr.length!= 0;
     static int findMin(int[] nums) {
        int answer = nums[0];
        for (int i = 0 ; i <= nums.length-1 ; i++){
            if (nums[i]< answer){
                answer = nums[i];
            }

        }
        return answer;
    }
}
