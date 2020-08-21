public class Solution {
    /**
     * @param num1: a non-negative integers
     * @param num2: a non-negative integers
     * @return: return sum of num1 and num2
     */
    public String addStrings(String num1, String num2) {
        // write your code here
        return new Integer(new Integer(num1)+new Integer(num2)).toString();
    }
}