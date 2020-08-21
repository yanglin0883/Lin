public class Solution {
    /**
     * @param source: 
     * @param target: 
     * @return: return the index
     */
    public int strStr(String source, String target) {
        // Write your code here
        if(target==null||target.length()==0)return 0;
        if(source==null||source.length()==0) return -1;
        int n=source.length(), m=target.length();
        for(int i=0;i<=n-m;i++){
            if(source.substring(i, i+m).equals(target)) return i;
        }
        return -1;
    }
}