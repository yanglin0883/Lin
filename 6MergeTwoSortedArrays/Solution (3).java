public class Solution {
    /**
     * @param A: sorted integer array A
     * @param B: sorted integer array B
     * @return: A new sorted integer array
     */
    public int[] mergeSortedArray(int[] A, int[] B) {
        // write your code here
        int[] res = new int[A.length+B.length];
        int a=0, b=0, r=0;
        while(a<A.length&&b<B.length){
            res[r++] = A[a]<B[b] ? A[a++] : B[b++];
        }
        while(a<A.length) res[r++] = A[a++];
        while(b<B.length) res[r++] = B[b++];
        return res;
    }
}