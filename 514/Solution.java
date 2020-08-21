public class Solution {
    /**
     * @param n: non-negative integer, n posts
     * @param k: non-negative integer, k colors
     * @return: an integer, the total number of ways
     */
    public int numWays(int n, int k) {
        // write your code here
        if(n==0)return 1;
        if(n==1)return k;
        if(n>2&&k==1) return 0;

        if(k==0)return 0;
        if(k==1)return 1;
        int res[]=new int[n+1];
        res[0]=1;
        res[1]=k;
        res[2]=k*k;
        for(int i=3;i<=n;i++)
        {
            res[i]= (k-1)*res[i-1] + (k-1)*res[i-2];
        }
        return res[n];
    }
}