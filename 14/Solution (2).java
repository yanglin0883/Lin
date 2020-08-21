public class Solution {
    /**
     * @param nums: The integer array.
     * @param target: Target to find.
     * @return: The first position of target. Position starts from 0.
     */
    public int binarySearch(int[] nums, int target) {
        // write your code here
        return find(nums, 0, nums.length, target);
    }
    private int find(int[]nums, int start, int end, int target){
        if(start==end) return -1;
        int mid = start+(end-start>>1);
        if(nums[mid]==target){
            if(mid==0||nums[mid-1]!=target) return mid;
            else return find(nums, start, mid, target);
        }
        else if(nums[mid]<target) return find(nums, mid+1, end, target);
        else return find(nums, start, mid, target);
    }
}