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
            if(A[mid]==target){//用二分法找到小区间开头和结尾
                int start=left, end = mid+1;
                while(start<end){
                    res[0] = start+(end-start>>1);
                    if(A[res[0]]==target && (res[0]==0||A[res[0]-1]!=target)) break;
                    else if(A[res[0]]!= target) start = res[0]+1;
                    else end=res[0];
                }
                start = mid; end = right;
                while(start<end){
                    res[1] = start+(end-start>>1);
                    if(A[res[1]]==target &&(res[1]==A.length-1 || A[res[1]+1]!=target)) break;
                    else if(A[res[1]]!=target) end = res[1];
                    else start = res[1]+1;
                }
                return res;
            }
            else if(A[mid]<target) left = mid+1;
            else right = mid;
        }
        return res;
    }
}