public class Solution {
    /*
     * @param :  A list of integers
     * @return: A list of unique permutations
     */
    public List<List<Integer>> permuteUnique(int[] nums) {
        // write your code here
        List<List<Integer>> res = new ArrayList<>();
        if(nums==null) return res;
        if(nums.length==0){
            res.add(new ArrayList());
            return res;
        }
        Arrays.sort(nums);
        visited = new boolean[nums.length];
        dfs(res, nums,new ArrayList());
        return res;
    }
    private boolean[] visited;
    private void dfs(List<List<Integer>>res, int[] nums, List<Integer>list){
        if(list.size()==nums.length){
            res.add(new ArrayList(list));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(visited[i]||(i!=0&&nums[i]==nums[i-1]&&!visited[i-1]))
                continue;
            list.add(nums[i]);
            visited[i] = true;
            dfs(res, nums, list);
            list.remove(list.size()-1);
            visited[i] = false;
        }
    }
};