public class Solution {
    /**
     * @param nums: an array
     * @param k: an integer
     * @return: rotate the array to the right by k steps
     */
    public int[] rotate(int[] nums, int k) {
        // Write your code here
        if(nums==null||nums.length <2) return nums;
        int len = nums.length;
        k %= len;
        if(k==0) return nums;
        reverse(nums, 0, len-k-1);
        reverse(nums, len-k, len-1);
        reverse(nums, 0, len-1);
        return nums;
    }
    private void reverse(int[] a, int i, int j)
    {
        while(i<j)
            swap(a,i++,j--);
    }
    private void swap(int[] a, int i, int j)
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}