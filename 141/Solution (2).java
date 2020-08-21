public class Solution {
    /**
     * @param x: An integer
     * @return: The sqrt of x
     */
    public int sqrt(int x) {
        // write your code here
        if(x<0) return -1;
        if(x<2) return x;
        long start = 1, end = x, mid=1;
        while(start<end){
            mid = start +(end-start>>1);
            long square = mid*mid;
            if(square == x) return (int)mid;
            else if(square>x) end = mid;
            else if((mid+1)*(mid+1)>x) return (int)mid;
            else start = mid+1;
        }
        return -1;
    }
}