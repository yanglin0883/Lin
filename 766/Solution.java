public class Solution {
    /**
     * @param n: a number represent year
     * @return: whether year n is a leap year.
     */
    public boolean isLeapYear(int n) {
        // write your code here
        if(n<0)return false;
        if(n%400==0) return true;
        if(n%100==0) return false;
        if(n%4==0) return true;
        return false;
    }
}