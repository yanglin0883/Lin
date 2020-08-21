public class Solution {
    /**
     * @param nums: an array of integers
     * @return: the number of unique integers
     */
    public int deduplication(int[] nums) {
        // write your code here
        if(nums.length < 2) return nums.length;
        Arrays.sort(nums);
        int slow=1;
        int fast = 0;
        while(fast < nums.length)
        {
            while(++fast < nums.length && nums[fast] != nums[slow-1]){
                nums[slow++] = nums[fast];
            }
        }
        return slow;
    }
}