public class Solution {
    /**
     * @param nums: An integer array
     * @return: nothing
     */
    public void recoverRotatedSortedArray(List<Integer> nums) {
        // write your code here
        if(nums.isEmpty()) return;
        int riot =0;
        System.out.println("riot= "+riot);
      
        for(int i=1;i< nums.size();i++)
        {
            if(nums.get(riot).compareTo(nums.get(i)) > 0){break;}
            riot++;System.out.println("riot= "+riot);
      
        }
        System.out.println("riot= "+riot);
      
        if(riot == nums.size()-1) return;
        //find the position rotated
         
         
         reverse(nums, 0, riot);
       
        reverse(nums, riot+1, nums.size()-1);
        reverse(nums, 0, nums.size()-1);
    }
    private void reverse(List<Integer> nums, int left, int right)
    {
        while(left<right)
        {
            swap(nums, left, right);
            left++;right--;
        }
    }
    
    private void swap(List<Integer> nums, int a, int b)
    {
        Integer temp = nums.get(a);
        nums.set(a, nums.get(b));
        nums.set(b,temp);
    }
}