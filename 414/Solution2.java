public class Solution {
    /**
     * @param dividend: the dividend
     * @param divisor: the divisor
     * @return: the result
     */
    public int divide(int dividend, int divisor) {
        // write your code here
        if(divisor == 0||(dividend==-2147483648 && divisor==-1)) return 2147483647;
        if(dividend == 0) return 0;
        
        return dividend / divisor;
    }
}