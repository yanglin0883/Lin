public class Solution {
    /**
     * @param nums: an array
     * @param k: an integer
     * @return: rotate the array to the right by k steps
     */
    public int[] rotate(int[] nums, int k) {
        // Write your code here
        if(nums==null||nums.length <2) return nums;
        int len =nums.length;
        k %= len;
        int[] res = new int[len];
        int j=0;
        for(int i=len-k;i<len;i++)
        {
            res[j++] = nums[i];
        }
        for(int i=0;i<len-k;i++)
        {
            res[j++] = nums[i];
        }
        return res;
    }
}