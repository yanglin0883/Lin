public class Solution {
    /*
     * @param nums: A list of integers
     * @return: A list of integers includes the index of the first number and the index of the last number
     */
    public int[] subarraySumClosest(int[] nums) {
        // write your code here
        int[]res = new int[2];
        if(nums==null||nums.length<=2) return res;
        Pair[] sum = new Pair[nums.length+1];
        sum[0] = new Pair(0,0);
        for(int i=1;i<sum.length;i++){
            sum[i] = new Pair(sum[i-1].sum + nums[i-1], i);
        }
        Arrays.sort(sum, (p1, p2)->p1.sum-p2.sum);
        int ans = Integer.MAX_VALUE;
        for(int i=1;i<sum.length;i++){
            if(ans>sum[i].sum - sum[i-1].sum){
                ans = sum[i].sum - sum[i-1].sum;
                int[] temp = {sum[i].index-1, sum[i-1].index-1};
                Arrays.sort(temp);
                res[0] = temp[0]+1;
                res[1] = temp[1];
            }
        }
        return res;
    }
    class Pair{
        int index, sum;
        Pair(int s, int i){
            index = i;
            sum = s;
        }
    }
}