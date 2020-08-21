public class Solution {
    /**
     * @param nums: a list of integers.
     * @param k: length of window.
     * @return: the sum of the element inside the window at each moving.
     */
    public int[] winSum(int[] nums, int k) {
        // write your code here
        if(nums.length==0||k>nums.length) return new int[0];
        int[] res = new int[nums.length-k+1];
        for(int i=0;i<k;i++){
            res[0] += nums[i];
            // System.out.println(res[0]);
        }
        for(int i=1;i<res.length;i++){
            res[i] = res[i-1]-nums[i-1]+nums[i+k-1];
        }
        return res;
    }
}