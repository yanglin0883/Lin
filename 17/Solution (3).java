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
        int max = 1;
        for(int i=0;i<nums.length;i++)
            max<<=1;
        for(int i=0;i<max;i++){
            ArrayList<Integer> temp = new ArrayList<>();
            int p=1;
            for(int j=0;j<nums.length;j++){
                if((p&i)>0) temp.add(nums[j]);
                p<<=1;
            }
            res.add(temp);
        }
        return res;
    }
}