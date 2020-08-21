public class Solution {
    /**
     * @param L: Given n pieces of wood with length L[i]
     * @param k: An integer
     * @return: The maximum length of the small pieces
     */
    public int woodCut(int[] L, int k) {
        // write your code here
        if(L==null||L.length==0||k<=0) return 0;
        int maxLen = L[0];
        for(int i:L) maxLen = Math.max(maxLen, i);
        //System.out.println(maxLen);
        int start = 0, end =maxLen, mid=0;
        while(start+1<end){
            mid = start+(end-start>>1);
            if(!canCut(mid, L, k)) end =mid;
            else if(canCut(mid+1, L, k)) start = mid;
            else return mid;
            //System.out.println(start+"  "+mid+"  "+end);
        }
        if(canCut(end, L, k)) return end;
        return start;
    }
    private boolean canCut(int len, int[]L, int k){
        if(len==0) return true;
        for(int i:L)
            k-=i/len;
        return k<=0;
    }
}