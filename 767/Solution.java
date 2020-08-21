public class Solution {
    /**
     * @param nums: a integer array
     * @return: nothing
     */
    public void reverseArray(int[] nums) {
        // write your code here
        if(nums == null || nums.length <2) return;
        int i=0;
        int j=nums.length -1;
        while(i<j)
        {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}