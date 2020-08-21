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
        Queue<List<Integer>> bfs = new LinkedList<>();
        ArrayList<Integer> start = new ArrayList();
        start.add(0);
        bfs.offer(start);
        while(!bfs.isEmpty()){
            List<Integer> temp = bfs.poll();
            int point = temp.get(temp.size()-1);
            temp.remove(temp.size()-1);
            res.add(temp);
            for(int i=point;i<nums.length;i++){
                ArrayList<Integer> node = new ArrayList(temp);
                node.add(nums[i]);
                node.add(i+1);
                bfs.offer(node);
            }
        }
        return res;
    }
}