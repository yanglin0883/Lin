public class Solution {
    /**
     * @param A: sorted integer array A
     * @param B: sorted integer array B
     * @return: A new sorted integer array
     */
    public int[] mergeSortedArray(int[] A, int[] B) {
        // write your code here
        int a[] = new int[A.length + B.length];
        for(int i = 0, j = 0, k = 0; k < a.length;){
            if(A[i]<=B[j]) 
                a[k++] = A[i++];
            else    a[k++] = B[j++];
            if(i== A.length) while(j<B.length)a[k++] = B[j++];
            if(j== B.length) while(i<A.length)a[k++] = A[i++];
        }
        return a;
    }
}