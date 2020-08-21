public class Solution {
    /**
     * @param s: a string
     * @return: return a string
     */
    public String reverseString(String s) {
        // write your code here
        if(s==null||s.length()<2) return s;
        char[] str = s.toCharArray();
        int left=-1;
        int right =str.length;
        char temp;
        while(++left<--right)
        {
            temp = str[left];
            str[left] = str[right];
            str[right] = temp;
        }
        return new String(str);
    }
}