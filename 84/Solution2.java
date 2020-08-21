public class Solution {
    /**
     * @param A: An integer array
     * @return: An integer array
     */
    public List<Integer> singleNumberIII(int[] A) {
        // write your code here
        ArrayList<Integer> res = new ArrayList<Integer>();
        if(A==null||A.length==0) return res;
        int sum = 0;
        for(int i: A){
            sum^=i;
        }
        int y= sum & (-sum);
        int a = 0;
        int b=0;
        for(int i:A){
            if((i & y) != 0) a ^= i;
            else b ^= i;
        }
        res.add(a);
        res.add(b);
        return res;
    }
}