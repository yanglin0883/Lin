public class Solution {
    /**
     * @param nums: An integer array sorted in ascending order
     * @param target: An integer
     * @return: An integer
     */
    public int findPosition(int[] nums, int target) {
        // write your code here
        return find(nums, 0, nums.length, target);
    }
    private int find(int[]nums, int start, int end, int target){
        if(start==end) return -1;
        int mid = start+(end-start)/2;
        if(nums[mid]==target) return mid;
        else if(nums[mid]<target) return find(nums, mid+1, end, target);
        else return find(nums, start, mid, target);
    }
}