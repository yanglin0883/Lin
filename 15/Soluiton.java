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
            result.add(new ArrayList<Integer>(permutation));//���ֱ��add(row)��ֻ��add��row�ĵ�ַ�������ַָ���row�ڽ���ÿ��recursion�ж��ᱻ���¸�ֵ���������˳�recursionʱ��row����˿գ���������add��rowȫ����˿�row��new ArrayList(row)�����þ��Ǹ����˵�ǰ�Ľ��row���Ժ�row����ô�ı䣬ҲûӰ�졣��ӿռ�
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