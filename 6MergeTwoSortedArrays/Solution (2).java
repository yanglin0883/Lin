public class Solution {
    /**
     * @param A: sorted integer array A
     * @param B: sorted integer array B
     * @return: A new sorted integer array
     */
    public int[] mergeSortedArray(int[] A, int[] B) {
        // write your code here
        int[] res = new int[A.length+B.length];
        int a=0, b=0, i=0;
        while(a<A.length&&b<B.length){
            if(A[a]<B[b]){
                res[i++] = A[a++];
            }
            else {
                res[i++] = B[b++];
            }
        }
        while(a<A.length) res[i++]=A[a++];
        while(b<B.length) res[i++] = B[b++];
        return res;
    }
}