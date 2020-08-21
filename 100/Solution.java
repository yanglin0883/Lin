public class Solution {
    /*
     * @param nums: An ineger array
     * @return: An integer
     */
    public int removeDuplicates(int[] nums) {
        // write your code here
        if(nums == null || nums.length ==0) return 0;
        if(nums.length == 1) return 1;
        int pre =nums[0];
        int newLen = nums.length;
        for(int i=1;i<newLen;i++)
        {
            if(nums[i] == pre)
            {
                newLen --;
                for(int j=i;j<newLen+1&&j<nums.length-1;j++)
                {
                    nums[j] = nums[j+1];
        //            System.out.println("nums= "+nums[j]+" j= "+j);
                }
                
                i--;
                // System.out.println("newLen= "+newLen+" i= "+i);
                // for(int j=0;j<nums.length;j++)
                //     System.out.print(nums[i]+",");
                // System.out.println();
            }
            pre = nums[i];
    //        System.out.println("i= "+i+" nums= "+nums[i]);
        }
        return newLen;
    }
}