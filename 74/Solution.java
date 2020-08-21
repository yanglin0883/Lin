/**
 * public class SVNRepo {
 *     public static boolean isBadVersion(int k);
 * }
 * you can use SVNRepo.isBadVersion(k) to judge whether 
 * the kth code version is bad or not.
*/
public class Solution {
    /**
     * @param n: An integer
     * @return: An integer which is the first bad version.
     */
    public int findFirstBadVersion(int n) {
        // write your code here
        long left = 1, right = (long)n+1, mid = 0;
        while(left<right){
            mid = left+(right-left>>1);
            //System.out.println(left+"   "+mid+"   "+right);
            boolean flag = SVNRepo.isBadVersion((int)mid);
            if(flag){
                if(mid==1||!SVNRepo.isBadVersion((int)mid-1)) return (int)mid;
                else right = mid;
            }else{
                left = mid+1;
            }
        }
        return -1;
    }
}