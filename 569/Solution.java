public class Solution {
    /**
     * @param num: a non-negative integer
     * @return: one digit
     */
    public int addDigits(int num) {
        // write your code here
        if(num ==0) return 0;
        int temp = num%9;
        if(temp == 0) return 9;
        else return temp;
    }
}