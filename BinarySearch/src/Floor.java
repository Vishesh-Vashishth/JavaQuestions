public class Floor {
    public static void main(String[] args) {
        int[] arr = {2,4,5,7,8,9,11,34};
        int target = 6;
        int ans = floor(arr,target);
        System.out.println(ans);

    }

    static int floor(int[] nums , int target){
        if (target<nums[0]){
            return -1;
        }

        int start = 0;
        int end = nums.length-1;

        //find mid

        while(start<=end){
            int mid = start + (end-start)/2;

            if (target>nums[mid]){
                start = mid+1;
            } else if (target<nums[mid]) {
                end = mid-1;
            }else {
                return mid;
            }
        }
        return end;
    }
}
