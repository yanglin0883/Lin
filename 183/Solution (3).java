public class Solution {
    /**
     * @param L: Given n pieces of wood with length L[i]
     * @param k: An integer
     * @return: The maximum length of the small pieces
     */
    public int woodCut(int[] L, int k) {
        // write your code here
        if(L==null||L.length==0||k<=0) return 0;
        int res=0;
        int start = 0, end =0, mid=0;
        for(int i:L) end = Math.max(end, i);
        //System.out.println(maxLen);
        while(start+1<end){
            mid = start+(end-start>>1);
            if(canCut(mid, L, k)) {
                res=mid;
                start = mid;
            }
            else
                end=mid;
            //System.out.println(start+"  "+mid+"  "+end);
        }
        
        return res;
    }
    private boolean canCut(int len, int[]L, int k){
        if(len==0) return true;
        for(int i:L)
            k-=i/len;
        return k<=0;
    }
}