public class Solution {
    /**
     * @param s: A string
     * @return: the length of last word
     */
    public int lengthOfLastWord(String s) {
        // write your code here
        if(s==null)return 0;
        s= s.trim();
        if(s=="") return 0;
        String[] string  = s.split(" ");
        return string[string.length-1].length();
    }
}