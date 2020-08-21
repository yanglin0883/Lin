public class Solution {
    /**
     * @param nums: An integer array sorted in ascending order
     * @param target: An integer
     * @return: An integer
     */
    public int lastPosition(int[] nums, int target) {
        // write your code here
        int left = 0, right = nums.length, mid=0;
        while(left<right){
            mid = left+(right-left>>1);
            if(nums[mid]==target){
                if(mid==nums.length-1||nums[mid+1]!=target)
                    return mid;
                else left = mid+1;
            }
            else if(nums[mid]<target) left = mid+1;
            else right = mid;
        }
        return -1;
    }
}