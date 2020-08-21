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
        return find(1, (long)n+1);
    }
    private int find(long start, long end){
        if(start==end) return -1;
        long mid = start+(end-start>>1);
        //System.out.println(start+"  "+mid+"  "+end);
        if(SVNRepo.isBadVersion((int)mid)){
            if(mid==1||!SVNRepo.isBadVersion((int)mid-1)) return (int)mid;
            else end = mid;
        }
        else
            start = mid+1;
        return find(start, end);
    }
}