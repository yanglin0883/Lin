public class Solution {
    /**
     * @param A: an integer array
     * @return: nothing
     */
    public void sortIntegers2(int[] A) {
        // write your code here
        if(A == null ||A.length<2) return;
        int[] left = new int[A.length/2];
        int[] right = new int[A.length - left.length];
        System.arraycopy(A, 0, left,0, left.length);
        System.arraycopy(A, left.length,right, 0, right.length);
        sortIntegers2(left);
        sortIntegers2(right);
        merge(left, right, A);
    }
    
    private void merge(int[] left, int[] right, int[] res)    {
        int iLeft=0;
        int iRight=0;
        int iRes = 0;
        while(iLeft<left.length &&iRight<right.length)
        {
            if(left[iLeft] < right[iRight])
                res[iRes++] = left[iLeft++];
            else res[iRes++] = right[iRight++];
        }
        System.arraycopy(left, iLeft, res, iRes, left.length - iLeft);
        System.arraycopy(right, iRight, res, iRes, right.length - iRight);
    }
}