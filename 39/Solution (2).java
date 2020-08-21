public class Solution {
    /**
     * @param nums: An integer array
     * @return: nothing
     */
    public void recoverRotatedSortedArray(List<Integer> nums) {
        // write your code here
        if(nums.size()<2) return;
        
        int offset=0;
        for(int i=0;i<nums.size();i++)
            if(nums.get(i)<nums.get(offset)){
                offset = i;
                break;
            }
        
        System.out.println(offset);
        reverse(nums, 0, offset-1);
        reverse(nums, offset, nums.size()-1);
        reverse(nums, 0, nums.size()-1);
    }
    void reverse(List<Integer> nums, int left, int right){
        Integer temp;
        while(left<right){
            temp = nums.get(left);
            nums.set(left++, nums.get(right));
            nums.set(right--, temp);
        }
    }
}