public class Solution {
    /**
     * @param A: An integer array
     * @param queries: The query list
     * @return: The number of element in the array that are smaller that the given integer
     */
    public List<Integer> countOfSmallerNumber(int[] A, int[] queries) {
        // write your code here
        ArrayList<Integer> res= new ArrayList<Integer>();
        if(queries==null||queries.length==0) return res;
        if(A==null||A.length==0){
            for(int i:queries){
                res.add(0);
            }
            return res;
        }
        int[] nums = new int[10001];
        for(int i:A){
            nums[i]++;
        }
        int[] sums = new int[10001];
        sums[0]=nums[0];
        for(int i=1;i<10001;i++)
            sums[i] = sums[i-1]+nums[i];
        for(int i:queries){
            res.add(sums[i-1]);
        }
        return res;
    }
}