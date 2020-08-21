public class Solution {
    /**
     * @param m: An integer m denotes the size of a backpack
     * @param A: Given n items with size A[i]
     * @param V: Given n items with value V[i]
     * @return: The maximum value
     */
    public int backPackII(int m, int[] A, int[] V) {
        // write your code here
        if(m<1||A==null||A.length<1) return 0;
        int len = A.length;
        int[] dp = new int[m+1];
        for(int i=0;i<len;i++){
            for(int j=m;j>=A[i];j--){
                dp[j] = Math.max(dp[j], dp[j-A[i]]+V[i]);
            }
        }
        return dp[m];
    }
}