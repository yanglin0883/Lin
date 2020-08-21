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
        dfs(res, nums, 0, new ArrayList<Integer>() );
        return res;
    }
    private void dfs(List<List<Integer>>res, int[] nums, int current, ArrayList<Integer> path){
        if(current==nums.length) {res.add(new ArrayList<>(path));return;}
        dfs(res, nums, current+1, path);
        path.add(nums[current]);
        dfs(res, nums, current+1, path);
        path.remove(path.size()-1);
    }
}