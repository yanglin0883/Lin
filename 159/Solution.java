public class Solution {
    /**
     * @param nums: a rotated sorted array
     * @return: the minimum number in the array
     */
    public int findMin(int[] nums) {
        // write your code here
        int left = 0, right = nums.length, mid=0, target=nums[nums.length-1];
        while(left<right){
            mid = left+(right-left>>1);
            if(nums[mid]<=target){
                if(mid==0||nums[mid-1]>nums[mid]) return nums[mid];
                else right = mid;
            }
            else left = mid+1;
        }
        return -1;
    }
}