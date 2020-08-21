public class Solution {
    /**
     * @param s: a string
     * @return: reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order
     */
    public String reverseWords(String s) {
        // Write your code here
        if(s==null||s.length()==0) return s;
        String[] words = s.split(" ");
        StringBuilder res = new StringBuilder();
        for(String i : words)
        {
            StringBuilder temp = new StringBuilder();
            temp.append(i);
            temp.reverse();
            res.append(temp);
            res.append(' ');
        }
        res.deleteCharAt(res.length()-1);
        return res.toString();
    }
}