public class Solution {
    /**
     * @param str: a string
     * @return: return a string
     */
    public char[] reverseWords(char[] str) {
        // write your code here
        if(str==null || str.length<2) return str;
        String temp = new String(str);
        String[] words = temp.split(" ");
        StringBuilder res = new StringBuilder();
        for(int i=words.length-1; i>-1;i--)
        {
            res.append(words[i]);
            res.append(' ');
        }
        res.deleteCharAt(res.length()-1);
        return res.toString().toCharArray();
    }
}