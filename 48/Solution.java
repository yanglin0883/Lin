public class Solution {
    /**
     * @param nums: A list of integers
     * @param k: An integer
     * @return: The majority number
     */
    public int majorityNumber(List<Integer> nums, int k) {
        // write your code here
        if(nums==null) return -1;
        int val = nums.size()/k + 1;
        HashMap<Integer, Integer> hm = new HashMap<Integer,Integer>();
        for(Integer i: nums){
            if(hm.containsKey(i)){
                int value = hm.get(i)+ 1;
                if(value == val) return i;
                hm.put(i,value);
            }
            else
                hm.put(i,1);
        }
        return -1;
    }
}