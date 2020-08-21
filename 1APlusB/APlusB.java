public class Solution {
    /**
     * @param a: An integer
     * @param b: An integer
     * @return: The sum of a and b 
     */
    public int aplusb(int a, int b) {
        // write your code heren
        int tempb = (a&b)<<1;
        int tempa = a^b;
        if(tempb ==0)
            return tempa;
        return aplusb(tempa,tempb);
    }
}