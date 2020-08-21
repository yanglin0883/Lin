public class Solution {
    /**
     * @param nums: A list of integers
     * @return: An integer denotes the middle number of the array
     */
    public int median(int[] nums) {
        // write your code here
        Arrays.sort(nums);
        int len = nums.length;
        if(len%2==0)return nums[len/2-1];
        return nums[len/2];
    }
}