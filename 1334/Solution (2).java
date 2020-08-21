public class Solution {
    /**
     * @param nums: an array
     * @param k: an integer
     * @return: rotate the array to the right by k steps
     */
    public int[] rotate(int[] nums, int k) {
        // Write your code here
        if(nums==null||nums.length==0) return nums;
        k%=nums.length;
        reverse(nums, 0, nums.length-k);
        reverse(nums, nums.length-k, nums.length);
        reverse(nums, 0, nums.length);
        return nums;
    }
    void reverse(int[] nums, int start, int end){
        end--;
        int temp;
        while(start<end){
            temp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = temp;
        }
    }
}