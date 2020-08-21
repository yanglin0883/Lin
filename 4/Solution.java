public class Solution {
    /**
     * @param n: An integer
     * @return: return a  integer as description.
     */
    public int nthUglyNumber(int n) {
        // write your code here
        if(n==1) return 1;
        Queue<Long> uglyNumber = new PriorityQueue<Long>();
        uglyNumber.offer(new Long(1));
        int[] factor = {2,3,5};
        for(int i=2;i<=n;i++)
        {
            long num = uglyNumber.poll();
            for(int j : factor)
            {
                long temp = num*j;
                if(!uglyNumber.contains(temp))
                    uglyNumber.offer(temp);
            }
        }
        return uglyNumber.poll().intValue();
    }
}