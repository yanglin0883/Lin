public class Solution {
    /**
     * @param triangle: a list of lists of integers
     * @return: An integer, minimum path sum
     */
    public int minimumTotal(int[][] triangle) {
        // write your code here
        if(triangle==null||triangle.length<1) return 0;
        int len = triangle[triangle.length-1].length;
        int[] dp = new int[len];
        dp[0] = triangle[0][0];
        for(int i=1;i<len;i++){
            int[] temp = new int[len];
            temp[0] = dp[0] + triangle[i][0];
            for(int j=1;j<i;j++){
                temp[j] = Math.min(dp[j],dp[j-1]) + triangle[i][j];
            }
            temp[i] = dp[i-1] + triangle[i][i];
            dp=temp;
        }
        int min=0;
        for(int i=0;i<len;i++)
            if(dp[min]>dp[i]) min = i;
        return dp[min];
    }
}