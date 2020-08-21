public class Solution {
    /**
     * @param num: Given the candidate numbers
     * @param target: Given the target number
     * @return: All the combinations that sum to target
     */
    public List<List<Integer>> combinationSum2(int[] num, int target) {
        // write your code here
        List<List<Integer>> res = new ArrayList<>();
        if(target==0){res.add(new ArrayList<Integer>());return res;}
        if(num==null||num.length==0) return res;
        int[][] nums = toUnique(num);
        dfs(nums, 0, target, new ArrayList<Integer>(), res);
        return res;
    }
    private void dfs(int[][]num, 
                     int index, 
                     int target, 
                     List<Integer>path, 
                     List<List<Integer>>res){
        if(target==0){
            res.add(new ArrayList<Integer>(path));
        }
        for(int i=index;i<num.length;i++){
            for(int j=1;j<=num[i][1];j++){
                if(target<num[i][0]*j)break;
                for(int k=0;k<j;k++)path.add(num[i][0]);
                dfs(num, i+1, target-num[i][0]*j, path, res);
                for(int k=0;k<j;k++)path.remove(path.size()-1);
            }
        }
    }
    private int[][] toUnique(int[]num){
        TreeMap<Integer, Integer> tm = new TreeMap<>();
        for(int i=0;i<num.length;i++)
            tm.put(num[i], tm.getOrDefault(num[i], 0)+1);
        int[][] res = new int[tm.size()][2];
        int i=0;
        for(Integer j:tm.keySet()){
            res[i][0] = j;
            res[i++][1] = tm.get(j);
        }
        return res;
    }
}