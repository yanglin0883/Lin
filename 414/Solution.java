public class Solution {
    /**
     * @param dividend: the dividend
     * @param divisor: the divisor
     * @return: the result
     */
    public int divide(int dividend, int divisor) {
        // write your code here
        if(divisor == 0) return 2147483647;
        if(dividend == 0) return 0;
        boolean sign = false;
        if(dividend <0){
            sign= !sign;
            dividend = - dividend;
        }
        if(divisor <0){
            sign= !sign;
            divisor = - divisor;
        }
        int res=0;
        while(dividend >=divisor){
            dividend -= divisor;
            res++;
        }
        if(sign) res = -res;
        return res;
    }
}