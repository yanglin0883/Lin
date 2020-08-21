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
        visited = new boolean[nums.length];
        dfs(nums, new ArrayList<Integer>(), res);
        return res;
    }
    boolean[] visited;
    private void dfs(int[]nums, 
                     ArrayList<Integer> list, 
                     List<List<Integer>> res){
        if(list.size()==nums.length){
            res.add(new ArrayList<Integer>(list));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(visited[i])
                continue;
            list.add(nums[i]);
            visited[i] = true;
            dfs(nums, list, res);
            list.remove(list.size()-1);
            visited[i] = false;
        }
    }
}