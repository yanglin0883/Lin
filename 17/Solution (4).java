public class Solution {
    /**
     * @param nums: A set of numbers
     * @return: A list of lists
     */
    public List<List<Integer>> subsets(int[] nums) {
        // write your code here
        List<List<Integer>> res = new ArrayList<>();
        if(nums==null||nums.length==0) {res.add(new ArrayList<Integer>());return  res;}
        Arrays.sort(nums);
        dfs(nums, 0, new ArrayList<Integer>(), res);
        return res;
    }
    void dfs(int[] nums, int index, ArrayList<Integer> subsets, List<List<Integer>> res){
        res.add(new ArrayList(subsets));
        for(int i=index;i<nums.length;i++){
            subsets.add(nums[i]);
            dfs(nums, i+1, subsets, res);
            subsets.remove(subsets.size()-1);
        }
    }
}