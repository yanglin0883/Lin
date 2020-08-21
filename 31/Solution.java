public class Solution {
    /**
     * @param nums: The integer array you should partition
     * @param k: An integer
     * @return: The index after partition
     */
    public int partitionArray(int[] nums, int k) {
        // write your code here
        if(nums == null || nums.length==0) return 0;
        int total =0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] < k) total++;
        }
        return total;
    }
}