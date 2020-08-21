public class Solution {
    /**
     * @param A: An array of Integer
     * @return: an integer
     */
    public int longestIncreasingContinuousSubsequence(int[] A) {
        // write your code here
        if(A==null) return 0;
        int len = A.length;
        if(len<2) return len;
        int maxL=1;
        int temp=1;
        for(int i=1;i<len;i++)
        {
            if(A[i]>A[i-1])
                {if(maxL<++temp) maxL = temp;}
            else
                temp = 1;
        }
        int maxR=1;
        temp=1;
        for(int i=len-2;i>-1;i--)
        {
            if(A[i]>A[i+1])
            {
                if(maxR<++temp) maxR = temp;
            }
            else
                temp=1;
        }
        return (maxL>maxR)?maxL:maxR;
    }
}