public class Solution {
    /**
     * @param nums: The integer array.
     * @param target: Target to find.
     * @return: The first position of target. Position starts from 0.
     */
    public int binarySearch(int[] nums, int target) {
        // write your code here
        int left =0, right = nums.length-1;
        //System.out.println("thisis");
        int mid =(left+right)>>1;

        while(nums[mid] != target)
        {   //System.out.println(left+"  "+mid+"  "+right);
            //System.out.println(flag);
            if(nums[mid]<target)
                left = mid +1;
            else if(nums[mid]>target)
                right = mid-1;
            if(left > right)         
                return -1;
            mid=(left+right)/2;
        }
        return minMid(nums,mid);
    }
    private int minMid(int[] a, int index)
    {
        int num=0;
       
        for(int i=index;i>-1;i--)
        {
            if(a[i]<a[index])
            {
                num = i+1; 
                break;
            }
        }
        return num;
    }
}