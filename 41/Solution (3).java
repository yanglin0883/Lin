public class Solution {
    /**
     * @param nums: A list of integers
     * @return: A integer indicate the sum of max subarray
     */
    public int maxSubArray(int[] nums) {
        // write your code here
        if(nums==null||nums.length==0) return 0;
        
        int max = Integer.MIN_VALUE, sum=0, minSum=0;
        for(int i:nums){
            sum+=i;
            max = Math.max(sum-minSum, max);
            minSum = Math.min(minSum, sum);
        }
        return max;
    }
}