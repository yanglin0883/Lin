public class Solution {
    /**
     * @param numbers: Give an array numbers of n integer
     * @return: Find all unique triplets in the array which gives the sum of zero.
     */
    public List<List<Integer>> threeSum(int[] numbers) {
        // write your code here
        List<List<Integer>> res = new ArrayList();
        if(numbers==null || numbers.length<3) return res;
        Arrays.sort(numbers);
        for(int i=0;i<numbers.length-2;i++){
            if(i!=0 && numbers[i]==numbers[i-1])continue;
            int left = i+1, right = numbers.length-1;
            int target = -numbers[i];
            twoSum(numbers, target, left, right, res);
        }
        return res;
    }
    
    void twoSum(int[]nums, int target, int left, int right, List<List<Integer>>res){
        while(left<right){
            if(nums[left]+nums[right]==target){
                List<Integer> tri = new ArrayList();
                tri.add(-target);
                tri.add(nums[left++]);
                tri.add(nums[right--]);
                res.add(tri);
                while(left<right && nums[left]==nums[left-1]) left++;
                while(left<right && nums[right]==nums[right+1])right--;
            }else if(nums[left]+nums[right]<target)left++;
            else right--;
        }
    }
}