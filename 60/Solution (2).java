public class Solution {
    /**
     * @param A: an integer sorted array
     * @param target: an integer to be inserted
     * @return: An integer
     */
    public int searchInsert(int[] A, int target) {
        // write your code here
        int start=0, end=A.length;
        while(start<end){
            int mid = start+(end-start>>1);
            if(A[mid]==target) return mid;
            else if(A[mid]>target) end = mid;
            else start = mid+1;
        }
        return start;
    }
}