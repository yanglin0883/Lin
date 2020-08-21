public class Solution {
    /**
     * @param pages: an array of integers
     * @param k: An integer
     * @return: an integer
     */
    public int copyBooks(int[] pages, int k) {
        // write your code here
        if(pages==null||pages.length==0) return 0;
        int start=0, end = 0;
        for(int i:pages) end+=i;
        while(start+1<end){
                //System.out.println(start+"  "+end);
            int mid = start+(end-start>>1);
            if(canFinish(mid, pages, k)){
                end = mid;
            }
            else 
                start = mid;
        }
        if(canFinish(start, pages, k)) return start;
        return end;
    }
    private boolean canFinish(int limit, int[] pages, int k) {
        int num = 0;
        int left = 0;
        for (int item : pages) {
            if (item > limit) {
                return false;
            }
            if (item > left) {
                num++;
                left = limit;
            }
            left -= item;
        }
        return num <= k;
    }
}