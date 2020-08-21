public class Solution {
    /**
     * @param nums: A list of integer which is 0, 1 or 2 
     * @return: nothing
     */
    public void sortColors(int[] nums) {
        // write your code here
        int left=0;
        int right=nums.length-1;
        int index =0;
        while(index<=right)
        {
            index=(left>index)?left:index;
          //  sop(nums);
            System.out.println("left= "+left+" index= "+index+" right= "+right);
            if(nums[index] == 0)
            {
                swap(nums,index, left);
                while(nums[left] == 0)
                {
                    left++;
                }
            }
            else if(nums[index] == 2)
            {
                swap(nums,index, right);
                while(nums[right] == 2)
                {
                    right--;
                }
            }
            else if(nums[index] == 1)
            {
                index++;
            }
        }
    }
    
    private void sop(int nums[])
    {
         for(int j=0;j<nums.length;j++)
        {
            System.out.print(nums[j]+",");
        }System.out.println();
    }
    
    private void swap(int a[], int l,int r)
    {
        int temp = a[l];
        a[l] = a[r];
        a[r] = temp;
    }
}