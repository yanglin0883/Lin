public class Solution {
    /**
     * @param nums: An integer array
     * @return: The second max number in the array.
     */
    public int secondMax(int[] nums) {
        // write your code here
        int max=0;
        int secMax = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>nums[max]) max=i;
        }
        if(secMax==max)secMax++;
        for(int i=0;i<nums.length;i++){
            if(i==max)continue;
            if(nums[i]>nums[secMax]) secMax=i;
        }
        return nums[secMax];
    }
}