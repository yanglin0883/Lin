public class Solution {
    /**
     * @param nums: an array of integers
     * @return: the number of unique integers
     */
    public int deduplication(int[] nums) {
        // write your code here
        ArrayList<Integer> res = new ArrayList<Integer>();
        int i=0;
        for(i=0;i<nums.length;i++)
        {
            Integer temp = nums[i];
            if(!res.contains(temp)) res.add(temp);
        }
        i=0;
        for(Integer j: res)
        {
            nums[i++] = j.intValue();
        }
        return i;
    }
}