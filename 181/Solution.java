public class Solution {
    /**
     * @param a: An integer
     * @param b: An integer
     * @return: An integer
     */
    public int bitSwapRequired(int a, int b) {
        // write your code here
        int res = a^b;
        int sum=0;
        while(res!=0)
        {
            sum += res & 1;
            res>>>=1;
        }
        return sum;
    }
}