public class Solution {
    /**
     * @param nums: a integer array
     * @return: the index of the largest element
     */
    public int dominantIndex(int[] nums) {
        // Write your code here
        if(nums==null||nums.length<1) return -1;
         if(nums.length == 1) return 0;
        int max = 0;
        int i=0;
        for(;i<nums.length;i++){
            if(nums[i]>= nums[max]){
                max= i;
            }
        }
        int secMax=0;
        if(max==0) secMax =1;
        for(i=0;i<nums.length;i++){
            if(i==max)continue;
            if(nums[i]>= nums[secMax]){
                secMax= i;
            }
        }
        // System.out.println(max+"  "+secMax);
        if(nums[max]>=nums[secMax]*2) return max;
        else return -1;
    }
}