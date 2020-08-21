public class Solution {
    /**
     * @param nums: A list of integers
     * @return: A list of integers includes the index of the first number and the index of the last number
     */
    public List<Integer> subarraySum(int[] nums) {
        // write your code here
        List<Integer> res = new ArrayList<>();
        if(nums==null||nums.length==0) return res;
        int[] sum = new int[nums.length+1];
        for(int i=1;i<sum.length;i++){
            sum[i] = sum[i-1]+nums[i-1];
        }
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<sum.length;j++){
                if(sum[i]==sum[j]){
                    res.add(i);
                    res.add(j-1);
                    return res;
                }
            }
        }
        return res;
    }
}