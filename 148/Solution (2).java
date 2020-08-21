public class Solution {
    /**
     * @param nums: A list of integer which is 0, 1 or 2 
     * @return: nothing
     */
    public void sortColors(int[] nums) {
        // write your code here
        if(nums==null || nums.length<2) return;
        int cur=0, left=0, right=nums.length-1;
        for(cur=0;cur<=right;cur++){
            if(nums[cur]==1)continue;
            if(nums[cur]==0){
                nums[cur]= nums[left];
                nums[left++] = 0;
            }
            else {
                nums[cur--]= nums[right];
                nums[right--] = 2;
            }
        }
    }
}