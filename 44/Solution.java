public class Solution {
    /*
     * @param nums: a list of integers
     * @return: A integer indicate the sum of minimum subarray
     */
    public int minSubArray(List<Integer> nums) {
        // write your code here
        if (nums == null || nums.size() <= 0) {
            return 0;
        }
        int temp;
        int res;
       
        temp = res = nums.get(0).intValue();
        System.out.println("res= "+res+" temp= "+temp);
        for(int i=1;i<nums.size();i++)
        {
            int a = nums.get(i).intValue();
            temp = min(temp + a, a);//之前算过的，和不要之前算过的，取较小
            res = min(res, temp);//直到第i个，众多字串之中较小的
            System.out.println("res= "+res+" temp= "+temp);
        }
        return res;
    }
    
    private int min(int a, int b)
    {
        return (a<b)?a:b;
    }
}