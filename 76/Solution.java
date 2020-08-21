public class Solution {
    /**
     * @param nums: An integer array
     * @return: The length of LIS (longest increasing subsequence)
     */
    public int longestIncreasingSubsequence(int[] nums) {
        // write your code here
        if(nums == null ||nums.length == 0) return 0;
        int len = nums.length;
        int res[]= new int[len];
        res[0]=1;
        for(int i=1;i<len;i++)
        {
            int max=0;
            for(int j=0;j<i;j++)
            {
                if(res[j]> max && nums[i]>nums[j]) max = res[j];
            }
            res[i] = max +1;
        }
        // sop(res);
        int max=1;
        for(int i=0;i<len;i++)
        {
            if(res[i]>max) max = res[i];
        }
        return max;
    }
    
    private void sop(int a[])
    {
        for(int i: a)
            System.out.print(i+", ");
        System.out.println();
    }
}