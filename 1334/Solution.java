public class Solution {
    /**
     * @param nums: an array
     * @param k: an integer
     * @return: rotate the array to the right by k steps
     */
    public int[] rotate(int[] nums, int k) {
        // Write your code here
        if(nums==null||nums.length <2) return nums;
        //k %= nums.length;
        for(int i=0;i<k;i++)
        {
            int temp = nums[nums.length-1];
            for(int j=nums.length-1;j>0;j--)
            {
                nums[j] = nums[j-1];
            }
            nums[0] = temp;
        }
        return nums;
    }
}