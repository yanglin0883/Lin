public class Solution {
    /**
     * @param nums: an integer array
     * @return: nothing
     */
    public void moveZeroes(int[] nums) {
        // write your code here
        if(nums == null || nums.length ==0) return;
        int len = nums.length;
        int i=0,j=0;
        while(i<len)
        {
            while(i<len&&nums[i]==0) i++;
            if(i<len)nums[j++] = nums[i++];
        }
        while(j<len)
        {
            nums[j++]=0;
        }
    }
}