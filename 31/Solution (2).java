public class Solution {
    /**
     * @param nums: The integer array you should partition
     * @param k: An integer
     * @return: The index after partition
     */
    public int partitionArray(int[] nums, int k) {
        // write your code here
        if(nums==null||nums.length<2) return 0;
        int i=0, j=nums.length-1;
        while(i<j){
            while(i<j&&nums[j]>=k)j--;
            while(i<j&&nums[i]<k)i++;
            if(i<j){int t = nums[i];
            nums[i] = nums[j];
            nums[j] = t;}
            //System.out.println(i+"  "+j);
        }
        // for(int a:nums) System.out.print(a+"  ");
        // System.out.println();
        if(nums[j]>=k) return j;
        return j+1;
    }
}