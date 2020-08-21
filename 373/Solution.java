public class Solution {
    /*
     * @param nums: an array of integers
     * @return: nothing
     */
    public void partitionArray(int[] nums) {
        // write your code here
        if(nums==null||nums.length<2)return;
        int len =nums.length;
        int[] odd = new int[len];
        int[] even = new int[len];
        int indexOdd=0, indexEven=0;
        for(int i=0;i<len;i++){
            if(nums[i]%2==0)
                even[indexEven++] = nums[i];
            else
                odd[indexOdd++] = nums[i];
        }
        int i=0;
        for(;i<indexOdd;i++){
            nums[i] = odd[i];
        }
        for(int j=0;j<indexEven;j++){
            nums[i+j] = odd[j];
        }
    }
}