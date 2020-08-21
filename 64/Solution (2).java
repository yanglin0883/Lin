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
        int index = m+n-1;
        m--; n--;
        while(m>-1&&n>-1){
            A[index--] = A[m]>B[n] ? A[m--] : B[n--];
        }
        while(n>-1) A[index--] = B[n--];
    }
}