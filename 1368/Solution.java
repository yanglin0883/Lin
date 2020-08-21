public class Solution {
    /**
     * @param nums: the arrays
     * @param k: the distance of the same number
     * @return: the ans of this question
     */
    public String sameNumber(int[] nums, int k) {
        // Write your code here
        if(nums==null || nums.length<2) return "NO";
        if(k>nums.length) return "YES";
        Map<Integer, Integer> hm = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(hm.containsKey(nums[i]))
            {
                if(i-hm.get(nums[i])<k)
                    return "YES";
                else{
                    hm.put(nums[i],i);
                }
            }
            else{
                hm.put(nums[i], i);
            }
        }
        return "NO";
    }
}