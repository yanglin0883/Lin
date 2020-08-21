public class Solution {
    /*
     * @param s: A string
     * @return: A string
     */
    public String reverseWords(String s) {
        // write your code here
        String[] words = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i=words.length-1;i>-1;i--){
            sb.append(words[i]);
            sb.append(" ");
        }
        if(sb.length()>0) sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
}