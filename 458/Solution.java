public class Solution {
    /**
     * @param nums: An integer array sorted in ascending order
     * @param target: An integer
     * @return: An integer
     */
    public int lastPosition(int[] nums, int target) {
        // write your code here
        return find(nums, 0, nums.length, target);
    }
    private int find(int[] nums, int start, int end, int target){
        if(start==end) return -1;
        int mid= start+(end-start>>1);
        if(nums[mid]==target){
            if(mid ==nums.length-1||nums[mid+1]!=target) return mid;
            else return find(nums, mid+1, end, target);
        }
        else if(nums[mid]<target)return find(nums, mid+1, end, target);
        else return find(nums, start, mid, target);
    }
}