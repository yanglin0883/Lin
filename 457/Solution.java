public class Solution {
    /**
     * @param nums: An integer array sorted in ascending order
     * @param target: An integer
     * @return: An integer
     */
    public int findPosition(int[] nums, int target) {
        // write your code here
        if(nums.length==0) return -1;
        int left = 0;
        int right = nums.length-1;
        int mid = (left+right)>>1;
        while(left<right){
            // System.out.println("l= "+left+" mid= "+mid+" r= "+right);
            mid = (left+right)>>1;
            if(nums[mid]==target){
                // System.out.println(nums[mid]+" "+target);
                return mid;
            }
            if(nums[mid+1]== target)return mid+1;
            if(nums[mid]<target) left = mid+1;
            if(nums[mid]>target) right = mid-1;
        }
        return -1;
    }
}