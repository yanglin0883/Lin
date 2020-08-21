public class Solution {
    /*
     * @param nums: A list of integers.
     * @return: A list of permutations.
     */
    public List<List<Integer>> permute(int[] nums) {
        // write your code here
        List<List<Integer>> res  = new ArrayList<>();
        if(nums==null) return res;
        if(nums.length==0){
            res.add(new ArrayList<>());
            return  res;
        }
        dfs(nums, new ArrayList<Integer>(), res);
        return res;
    }
    private void dfs(int[]nums, 
                     ArrayList<Integer> list, 
                     List<List<Integer>> res){
        if(list.size()==nums.length){
            res.add(new ArrayList<Integer>(list));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(list.contains(nums[i]))
                continue;
            list.add(nums[i]);
            dfs(nums, list, res);
            list.remove(list.size()-1);
        }
    }
}