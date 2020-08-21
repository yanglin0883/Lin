public class Solution {
    /**
     * @param A: An integer array
     * @return: An integer
     */
    public int singleNumberII(int[] A) {
        // write your code here
        if(A==null) return -1;
        if(A.length==1) return A[0];
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for(int i : A){
            if(hm.containsKey(i)){
                hm.put(i, 2);
            }
            else
                hm.put(i, 1);
        }
        for(Integer i: hm.keySet()){
            if(hm.get(i) == 1) return i.intValue();
        }
        return -1;
    }
}