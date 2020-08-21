public class Solution {
    /**
     * @param A: an integer sorted array
     * @param target: an integer to be inserted
     * @return: a list of length 2, [index1, index2]
     */
    public int[] searchRange(int[] A, int target) {
        // write your code here
        int res[] = {-1,-1};
        int left=0, right = A.length, mid=0;
        while(left<right){
            mid = left +(right-left>>1);
            if(A[mid]==target){
                break;
            }
            else if(A[mid]<target) left = mid+1;
            else right = mid;
        }
        if(A.length<=mid||A[mid]!=target)return res;
        for(left = mid;left>-1&&A[left]==target;left--);
        for(right=mid;right<A.length&&A[right]==target;right++);
        res[0]=left+1;
        res[1] = right-1;
        return res;
    }
}