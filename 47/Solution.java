public class Solution {
    /*
     * @param nums: a list of integers
     * @return: The majority number that occurs more than 1/3
     */
    public int majorityNumber(List<Integer> nums) {
        // write your code here
        if(nums==null) return -1;
        int value = nums.size()/3 + 1;
        HashMap<Integer, Integer> count = new HashMap<Integer,Integer>();
        for(Integer i : nums){
            // System.out.println(i.toString());
            if(!count.containsKey(i)){
                count.put(i, 1);
            }
            else{
                int val = count.get(i)+1;
                if(val==value) return i;
                else count.put(i, val);
            }
        }
        return -1;
    }
}