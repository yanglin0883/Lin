public class Solution {
    /**
     * @param numbers: Give an array
     * @param target: An integer
     * @return: Find all unique quadruplets in the array which gives the sum of zero
     */
    public List<List<Integer>> fourSum(int[] nums, int target) {
        // write your code here
        List<List<Integer>>res = new ArrayList();
        if(nums==null||nums.length<4)return res;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-3;i++){
            if(i!=0&&nums[i]==nums[i-1]) continue;
            for(int j=i+1;j<nums.length-2;j++){
                if(j!=i+1&&nums[j]==nums[j-1]) continue;
                int left = j+1, right = nums.length-1;
                while(left<right){
                    int sum = nums[i]+nums[j]+nums[left]+nums[right];
                    if(sum<target) left++;
                    else if(sum>target) right--;
                    else{
                        List<Integer> temp = new ArrayList();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[left++]);
                        temp.add(nums[right--]);
                        res.add(temp);
                        while(left<right&&nums[left]==nums[left-1])left++;
                        while(left<right&&nums[right]==nums[right+1])right--;
                    }
                }
            }
            
        }
        return res;
    }
}