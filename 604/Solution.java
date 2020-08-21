public class Solution {
    /**
     * @param nums: a list of integers.
     * @param k: length of window.
     * @return: the sum of the element inside the window at each moving.
     */
    public int[] winSum(int[] nums, int k) {
        // write your code here
        int[] res=null;
        if(nums==null||k<1|nums.length < k) {res = new int[0];return res;}
        int len = nums.length;
        res = new int[len-k+1];
        for(int i=0;i<k;i++)
            res[0] += nums[i];
        int j=1;
        for(int i=k;i<len;i++){
            res[j] = res[j-1] - nums[i-k] + nums[i];
            j++;
        }
        return res;
    }
}