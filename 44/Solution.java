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
            temp = min(temp + a, a);//֮ǰ����ģ��Ͳ�Ҫ֮ǰ����ģ�ȡ��С
            res = min(res, temp);//ֱ����i�����ڶ��ִ�֮�н�С��
            System.out.println("res= "+res+" temp= "+temp);
        }
        return res;
    }
    
    private int min(int a, int b)
    {
        return (a<b)?a:b;
    }
}