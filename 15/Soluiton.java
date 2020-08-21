public class Solution {
    /*
     * @param nums: A list of integers.
     * @return: A list of permutations.
     */
    public List<List<Integer>> permute(int[] nums) {
        // write your code here
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(nums==null ) return res;
        if(nums.length ==0){res.add(new ArrayList<Integer>()); return res;}
        int len = nums.length;
        dfs(nums,new boolean[nums.length], new ArrayList<Integer>(), res);
        return res;
    }
    
    public void dfs(int[] nums, boolean[] visited, List<Integer> permutation, List<List<Integer>> result){
        if(permutation.size() == nums.length){
            result.add(new ArrayList<Integer>(permutation));//如果直接add(row)，只是add了row的地址，这个地址指向的row在今后的每次recursion中都会被重新赋值，而最终退出recursion时，row变成了空，所以最终add的row全变成了空row。new ArrayList(row)的作用就是复制了当前的结果row，以后row再怎么改变，也没影响。添加空集
            return;
        }
        
        for(int i = 0; i < nums.length; i++){
            if(visited[i])
            continue;
        
                permutation.add(nums[i]);
                visited[i] = true;
                dfs(nums, visited, permutation, result);
                visited[i] = false;
                permutation.remove(permutation.size()-1);
        }
    
    }
}