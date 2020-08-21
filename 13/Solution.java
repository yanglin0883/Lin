public class Solution {
    /**
     * @param source: 
     * @param target: 
     * @return: return the index
     */
    public int strStr(String source, String target) {
        // Write your code here
        int res = -1;
        if(source.equals(""))
            if(target.equals(""))
                return 0;
            else
                return -1;
        for(int i=0;i<source.length();i++)
            if(source.regionMatches(i, target, 0, target.length()))
            {
                res= i;
                break;
            }
        return res;
    }
}