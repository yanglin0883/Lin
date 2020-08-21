public class Solution {
    /*
     * @param A: sorted integer array A which has m elements, but size of A is m+n
     * @param m: An integer
     * @param B: sorted integer array B which has n elements
     * @param n: An integer
     * @return: nothing
     */
    public void mergeSortedArray(int[] A, int m, int[] B, int n) {
        // write your code here
        int[] C = new int[m+n];
        int i=0,j=0;
        while(i+j<m+n)
        {
            if(i>=m)
            {
                for(;j<n;j++)
                {
                    C[i+j] = B[j];
                }
        //         System.out.println("j flushed");
        //         sop(C);
                break;
            }
            if(j>=n)
            {
                for(;i<m;i++)
                {
                    C[i+j] = A[i];
        //            System.out.println("i inner"+i);
                }
        //         System.out.println("i flushed");
        //         sop(C);
                break;
            }
            if(A[i]<=B[j]) 
            {
                C[i+j] = A[i];
                i++;
        //         System.out.println("i pushed"+i);
            }
            if(A[i]>B[j])
            {
                C[i+j] =B[j];
                j++;
       //          System.out.println("j pushed"+j);
            }
       //     sop(C);
        }
        
        for(i=0;i<m+n;i++)
        {
            A[i] = C[i];
        }
    }
/*    void sop(int[] C)
    {
        for(int i=0;i<C.length;i++)
        {
            System.out.print("C["+i+"]="+C[i]+" ");
        }
        System.out.println();
    }
*/
}