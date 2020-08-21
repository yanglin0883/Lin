public class Solution {
    /**
     * @param nums: a mountain sequence which increase firstly and then decrease
     * @return: then mountain top
     */
    public int mountainSequence(int[] nums) {
        // write your code here
        if(nums==null||nums.length<1)
            return -1;
        if(nums.length==1) return nums[0];
        if(nums[1]<=nums[0]) return nums[0];
        if(nums[nums.length-2]<=nums[nums.length-1]) return nums[nums.length-1];
        
        int left = 1, right = nums.length-1, mid = -1;
        while(left<right){
            mid = left+(right-left>>1);
            if(nums[mid]>nums[mid-1]&&nums[mid]>nums[mid+1]) return nums[mid];
            else if(nums[mid]>nums[mid-1]&&nums[mid]<nums[mid+1]) left = mid+1;
            else right = mid;
        }
        return -1;
    }
}