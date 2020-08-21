public class Solution {
    /*
     * @param nums: A list of integers
     * @return: An integer denotes the sum of max two non-overlapping subarrays
     */
    public int maxTwoSubArrays(List<Integer> nums) {
        // write your code here
        if(nums.size()<2) return -1;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.size();i++){
            // int left = find(nums, 0, i);
            // int right = find(nums, i+1, nums.size()-1);
            int sum = find(nums, 0, i)+find(nums, i+1, nums.size()-1);
            max = max>sum? max : sum;
        }
        return max;
    }
    
    private int find(List<Integer> nums, int begin, int end){
        if(begin >= end){
            return nums.get(end).intValue();
        }
        int max = nums.get(begin);
        int sum =0;
        for(int i=begin+1;i<=end;i++){
            sum+=nums.get(i).intValue();
            if(sum>max) max = sum;
            else if(sum<0) sum=0;
        }
        return max;
    }
}