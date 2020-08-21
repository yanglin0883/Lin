public class Solution {
    /**
     * @param n: An integer
     * @param nums: An array
     * @return: the Kth largest element
     */
    public int kthLargestElement(int n, int[] nums) {
        // write your code here
        if(n>nums.length) return -1;
        return quickSelect(nums, 0, nums.length-1, n);
    }
    
    int quickSelect(int[]nums, int start, int end, int k){
        if(start>=end) return nums[start];
        int target = nums[start];
        int left = start, right = end, temp=0;
        while(left<right){
            while(left<right && nums[right]<=target) right--;
            while(left<right && nums[left]>target) left++;
            temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
        }
        nums[start] = nums[right];
        nums[right] = temp;
        if(k-1 > right) return quickSelect(nums, right+1, end, k);
        else if(k-1 < right) return quickSelect(nums, start, right-1, k);
        else return nums[k-1];
    }
}