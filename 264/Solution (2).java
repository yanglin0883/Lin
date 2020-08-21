class Solution {
    public int nthUglyNumber(int n) {
        int c1=0, c2=0, c3=0;
        int n1=2, n2=3, n3=5;
        int dp[] = new int[n];
        dp[0]=1;
        for(int i=1;i<n;i++){
            dp[i] = Math.min(Math.min(n1, n2),n3);
            if(dp[i]==n1) {
                n1 = 2*dp[++c1];
            }
            if(dp[i]==n2) {
                n2 = 3*dp[++c2];
            }
            if(dp[i]==n3) {
                n3 = 5*dp[++c3];
            }
            // System.out.println(i+"  "+dp[i]+" "+c1+": "+n1+" "+c2+": "+n2+"  "+c3+": "+n3);
        }
        return dp[n-1];
    }
}