public class Solution {
    /**
     * @param A: An integer array
     * @return: An integer
     */
    public int singleNumber(int[] A) {
        // write your code here
        boolean flag = true;
        int i=0;
        for( i = 0; i< A.length; i++)
        {
            flag = true;
            for(int j = 0; j < A.length;j++)
            {
                if(i == j) continue;
                if(A[i] == A[j]) 
                {
                    flag = false;
                    break;
                }
            }
            if(flag)
                break;
        }
        return A[i];
    }
}