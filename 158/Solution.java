public class Solution {
    /**
     * @param s: The first string
     * @param t: The second string
     * @return: true or false
     */
    public boolean anagram(String s, String t) {
        // write your code here
        if(s==null) 
        {
            if(t==null) return true;
            else return false;
        }
        if(s.length() != t.length())
            return false;
        
        int[] ch = new int[256];
        for(int i=0;i<s.length();i++)
        {
            ch[s.charAt(i)+128]++;
        }
        
        for(int i=0;i<t.length();i++)
        {
            if(--ch[t.charAt(i)+128]<0) return false;
        }
        
        return true;
    }
}