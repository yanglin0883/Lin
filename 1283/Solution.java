public class Solution {
    /**
     * @param s: a string
     * @return: return a string
     */
    public String reverseString(String s) {
        // write your code here
        if(s==null||s.length()<2) return s;
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        return sb.toString();
    }
}