public class Solution {
    /**
     * @param x: An integer
     * @return: The sqrt of x
     */
    public int sqrt(int x) {
        // write your code here
        if(x<0)
            return -1;
        if(x== 0)
            return 0;
        if(x<4)
            return 1;
        long left = 1;
        long right = (long)x;
        long mid=(left+right)>>1 ;
        while(left< right)
        {
        //    System.out.println("left= "+left+" mid= "+mid+" right= "+right);
            if(mid*mid ==(long)x) return (int)mid;
            if(lessThanSqrt(x, mid))
            {
                left = mid+1;
            }
            else
            {
                right = mid-1;
            }
            mid = (left+right)>>1;
        }
    //    System.out.println(""+mid);
        if((mid+1)*(mid+1) <= x) return (int)mid+1;
        if(mid*mid>x) return (int)mid-1;
        return (int)mid;
    }
    
    private boolean lessThanSqrt(int x, long mid)
    {
        return (mid*mid) < (long)x;
    }
}