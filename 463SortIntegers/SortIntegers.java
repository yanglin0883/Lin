public class Solution {
    /**
     * @param A: an integer array
     * @return: nothing
     */
    public void sortIntegers(int[] A) {
        // write your code here
        int temp = 0, t;
        for(int i=0; i<A.length;i++)
        {
            temp = i;
            for(int j=i + 1; j<A.length;j++)
            {
                if(A[j] <A[temp]) temp = j;
            }
            if(temp != i)
            {
                t = A[temp];
                A[temp] =A[i];
                A[i] = t;
            }
        }
    }
}