public class Solution {
    /**
     * @param nums: an integer array
     * @return: nothing
     */
    public void moveZeroes(int[] nums) {
        // write your code here
        if(nums==null || nums.length<2) return;
        int fast=0, slow=0;
        while(fast<nums.length){
            if(nums[fast]!=0) nums[slow++] = nums[fast];
            fast++;
        }
        while(slow<nums.length) nums[slow++] = 0;
        
    }
}