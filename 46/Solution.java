
public class Solution {
    /*
     * @param nums: a list of integers
     * @return: find a  majority number
     */
    public int majorityNumber(List<Integer> nums) {
        // write your code here
        if(nums.size() == 0)
            return 0;//should throw an excption here
        Integer result = nums.get(0);
        int count = 1;
        for(int i=1; i<nums.size(); i++)
        {
            if(count == 0)
            {
                result = nums.get(i);
                count =1;
            }
            else if(nums.get(i) == result)
                count++;
            else count--;
        }
        return result;
    }
}