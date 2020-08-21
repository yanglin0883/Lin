public class Solution {
    /**
     * @param s: a string which consists of lowercase or uppercase letters
     * @return: the length of the longest palindromes that can be built
     */
    public int longestPalindrome(String s) {
        // write your code here
        if(s == null) return 1;
        if(s.length()==0) return 0;
        int ch[] = new int[52];
        int len =s.length();
        for(int i=0;i<len;i++)
        {
            char temp = s.charAt(i);
            if(temp<'a') ch[temp-'A']++;
            else ch[temp-'a'+26]++;
        }
        
        int single=0;
        for(int i=0;i<52;i++)
        {
            if(ch[i]%2 == 1)single++;
        }
        if(single ==0) return len;
        return len - single+1;
    }
}