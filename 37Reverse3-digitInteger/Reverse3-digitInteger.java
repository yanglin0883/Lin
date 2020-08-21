public class Solution {
    /**
     * @param number: A 3-digit number.
     * @return: Reversed number.
     */
    public int reverseInteger(int number) {
        // write your code here
        int res =0;
        res += number % 10;
        number /= 10;
        res *= 10;
        res += number % 10;
        number /= 10;
        res *= 10;
        //res += number % 10;
        return res + number % 10;
    }
}