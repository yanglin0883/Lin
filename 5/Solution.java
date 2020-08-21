public class Solution {
    /**
     * @param n: An integer
     * @param nums: An array
     * @return: the Kth largest element
     */
    public int kthLargestElement(int n, int[] nums) {
        // write your code here
        if(nums == null ) return 0;
        if(nums.length == 0) return -1;
        if(n < 1) return -1;
        if(nums.length < n) return -1;
        
        Arrays.sort(nums);
        return nums[nums.length-n];
    }
}