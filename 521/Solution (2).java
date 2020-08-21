public class Solution {
    /**
     * @param nums: an array of integers
     * @return: the number of unique integers
     */
    public int deduplication(int[] nums) {
        // write your code here
        HashSet<Integer> res = new HashSet<Integer>();
        int i=0;
        for(i=0;i<nums.length;i++)
        {
             res.add(nums[i]);
        }
        i=0;
        for(Integer j: res)
        {
            nums[i++] = j.intValue();
        }
        return i;
    }
}