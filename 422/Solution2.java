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
        int res =0;
        for(int i=s.length()-1;i>-1;i--){
            
            if(s.charAt(i) ==' ') return res;res++;
        }
        return res;
    }
}