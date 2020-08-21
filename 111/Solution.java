public class Solution {
    /**
     * @param n: An integer
     * @return: An integer
     */
    public int climbStairs(int n) {
        // write your code here
        if(n<1) return 0;
        if(n==1) return 1;
        int[] steps= new int[n+1];
        steps[0] = 1;
        steps[1] = 1;
        for(int i=2;i<steps.length;i++)
        {
            steps[i] = steps[i-1]+steps[i-2];
        }
        return steps[n];
    }
}