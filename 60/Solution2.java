public class Solution {
    /**
     * @param A: an integer sorted array
     * @param target: an integer to be inserted
     * @return: An integer
     */
    public int searchInsert(int[] A, int target) {
        // write your code here
        if(A.length == 0)return(0);
        int left=0;
        int right = A.length-1;
        int mid = (left+right)>>1;
        while(left<= right)
        {
            mid = (left+right)>>1;
            System.out.println("mid="+mid);
            if(A[mid]> target)
            {
                right = mid -1;
            }
            else if(A[mid]< target)
            {
                left = mid +1;
            }if(A[mid] == target)
                return mid;
        }
        if(A[mid] <target) return mid+1;
        return mid;
    }
}