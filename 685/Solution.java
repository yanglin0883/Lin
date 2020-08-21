public class Solution {
    /**
     * @param nums: a continuous stream of numbers
     * @param number: a number
     * @return: returns the first unique number
     */
    public int firstUniqueNumber(int[] nums, int number) {
        // Write your code here
        if(nums == null ||nums.length<1) return -1;
        int indexOfEnd=-1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] == number) 
            {
                indexOfEnd = i;
                break;
            }
        }
        if(indexOfEnd == -1) return -1;
        boolean[] judge = new boolean[indexOfEnd+1];
        for(int i=0;i<= indexOfEnd; i++)
        {
            if(!judge[i])
            {
                for(int j=i+1;j<=indexOfEnd;j++)
                {
                    if(!judge[j] && nums[i] == nums[j])
                    {
                        judge[i]=true;
                        judge[j]=true;
                    }
                }
            }
            if(!judge[i]) return nums[i];
        }
        return -1;
    }
}