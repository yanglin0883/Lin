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
                if(mid==0||A[mid-1]!=target){ res[0] = mid;break;}
                else right = mid;
            }
            else if(A[mid]<target) left = mid+1;
            else right = mid;
        }
        left=res[0]==-1?0:res[0]; right = A.length;
        while(left<right){
            mid = left +(right-left>>1);
            //System.out.println(mid);
            if(A[mid]==target){
                if(mid==A.length-1||A[mid+1]!=target){ res[1] = mid;break;}
                else left = mid+1;
            }
            else if(A[mid]<target) left = mid+1;
            else right = mid;
        }
        return res;
    }
}