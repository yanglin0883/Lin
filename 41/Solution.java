public class Solution {
    /**
     * @param nums: A list of integers
     * @return: A integer indicate the sum of max subarray
     */
    public int maxSubArray(int[] nums) {
        // write your code here
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int temp;
        int res;
        temp = res = nums[0];
        for(int i=1;i<nums.length;i++)
        {
            temp = Math.max(temp + nums[i], nums[i]);//之前算过的，和不要之前算过的，取较大
            res = Math.max(res, temp);//直到第i个，众多字串之中较大的
        //    System.out.println("res= "+res);
        }
        return res;
    }
}