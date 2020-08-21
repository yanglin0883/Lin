public class Solution {
    /**
     * @param nums: The integer array.
     * @param target: Target to find.
     * @return: The first position of target. Position starts from 0.
     */
    public int binarySearch(int[] nums, int target) {
        // write your code here
        int left = 0, right = nums.length;
        int mid = left+(right-left>>1);
        while(left<right){
            mid = left+(right-left>>1);
            if(nums[mid]==target){
                if(mid==0||nums[mid-1]!=target) return mid;
                else right = mid;
            }
            else if(nums[mid]<target) left = mid+1;
            else right = mid;
        }
        return -1;
    }
}