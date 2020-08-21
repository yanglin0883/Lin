public class Solution {
    /**
     * @param nums: An integer array sorted in ascending order
     * @param target: An integer
     * @return: An integer
     */
    public int findPosition(int[] nums, int target) {
        // write your code here
        int left = 0;
        int right = nums.length;
        int mid = left+(right-left>>1);
        while(left<right){
            mid = left+(right-left>>1);
            if(nums[mid]==target) return mid;
            else if(nums[mid]<target) left = mid+1;
            else right = mid;
        }
        return -1;
    }
}