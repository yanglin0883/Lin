public class Solution {
    /**
     * @param x: An integer
     * @return: The sqrt of x
     */
    public int sqrt(int x) {
        // write your code here
        if(x<0) return -1;
        if(x<2) return x;
        int start = 1, end = x, mid=1;
        while(start+1<end){
            mid = start +(end-start>>1);
            int q = x/mid;
            if(mid==q) return mid;
            else if(mid>q) end = mid;
            else start = mid;
        }
        if(start+1 > x/(start+1)) return start;
        return start+1;
    }
}