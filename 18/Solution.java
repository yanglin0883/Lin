public class Solution {
    /**
     * @param nums: A set of numbers.
     * @return: A list of lists. All valid subsets.
     */
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        // write your code here
        ArrayList<List<Integer>> res = new ArrayList<>();
        if(nums==null||nums.length==0) {res.add(new ArrayList<Integer>());return res;}
        Arrays.sort(nums);
        dfs(nums, 0, new ArrayList<Integer>(), res);
        return res;
    }
    private void dfs(int[]nums,
                     int index,
                     ArrayList<Integer>path,
                     ArrayList<List<Integer>>res){
        res.add(new ArrayList<Integer>(path));
        for(int i=index;i<nums.length;i++){
            if(i!=0&&nums[i]==nums[i-1]&&i>index)
                continue;
            path.add(nums[i]);
            dfs(nums, i+1, path, res);
            path.remove(path.size()-1);
        }
    }
}