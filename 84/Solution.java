public class Solution {
    /**
     * @param A: An integer array
     * @return: An integer array
     */
    public List<Integer> singleNumberIII(int[] A) {
        // write your code here
        ArrayList<Integer> res = new ArrayList<Integer>();
        if(A==null||A.length==0) return res;
        for(int i: A){
            if(res.contains(i)) res.remove(new Integer(i));
            else res.add(i);
        }
        return res;
    }
}