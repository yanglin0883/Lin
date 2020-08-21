public class Solution {
    /**
     * @param candidates: A list of integers
     * @param target: An integer
     * @return: A list of lists of integers
     */
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        // write your code here
        List<List<Integer>> res = new ArrayList<>();
        if(target==0) {res.add(new ArrayList<Integer>());return res;}
        if(candidates.length==0) return res;
        Arrays.sort(candidates);
        int fast=0, slow=0;
        for(fast=0;fast<candidates.length;fast++){
            while(fast>0&&fast<candidates.length&&candidates[fast]==candidates[fast-1]) fast++;
            if(fast == candidates.length) break;
            candidates[slow++]=candidates[fast];
        }
        dfs(candidates,slow, 0, target, 0, new ArrayList<Integer>(), res);
        return res;
    }
    private void dfs(int[]nums,int length, int index, int target, int sum, ArrayList<Integer>path, List<List<Integer>> res){
        if(sum==target){
            res.add(new ArrayList(path));
            return;
        }
        if(sum>target)
            return;
        for(int i=index;i<length;i++){
            path.add(nums[i]);
            dfs(nums,length, i, target, sum+nums[i], path, res);
            path.remove(path.size()-1);
        }
    }
}