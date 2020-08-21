public class Solution {
    /**
     * @param nums: A list of integers
     * @return: A integer indicate the sum of max subarray
     */
    public int maxSubArray(int[] nums) {
        // write your code here
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int temp;
        int res;
        temp = res = nums[0];
        for(int i=1;i<nums.length;i++)
        {
            temp = Math.max(temp + nums[i], nums[i]);//֮ǰ����ģ��Ͳ�Ҫ֮ǰ����ģ�ȡ�ϴ�
            res = Math.max(res, temp);//ֱ����i�����ڶ��ִ�֮�нϴ��
        //    System.out.println("res= "+res);
        }
        return res;
    }
}