import java.util.Arrays;
public class Solution {
    /**
     * @param nums:  an array of n integers
     * @param target: a target
     * @return: the number of index triplets satisfy the condition nums[i] + nums[j] + nums[k] < target
     */
    public int threeSumSmaller(int[] nums, int target) {
        // Write your code here
        if(nums==null||nums.length<3) return 0;
        Arrays.sort(nums);
        int total=0;
        for(int i=0;i<nums.length;i++)
        for(int j=i+1;j<nums.length;j++)
        for(int k=j+1;k<nums.length;k++){
            if(nums[j]+nums[k]+nums[i]<target) total++;
        }
        return total;
    }
}