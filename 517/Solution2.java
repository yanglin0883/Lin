public class Solution {
    /**
     * @param n: An integer
     * @return: return a  integer as description.
     */
    public int nthUglyNumber(int n) {//数据较大的时候， 时间超出
        // write your code here
        int count=0;
        long i;
        for( i=0;count <= n; i++)
        {
            if(isUgly(i)) count ++;
       //     System.out.println("i= "+i+" count= "+count);
            if(count >=n) break;
        }
        return (int)i;
    }
    
    private boolean isUgly(long n)
    {
        if(n<1) return false;
        int[] factor = {2,3,5};
        for(int f: factor)
        {
            while(n%f == 0)n=n/f;
        }
        if(n == 1) return true;
        else return false;
    }
}