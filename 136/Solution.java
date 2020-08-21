public class Solution {
    /*
     * @param s: A string
     * @return: A list of lists of string
     */
    public List<List<String>> partition(String s) {
        // write your code here
        List<List<String>> res = new ArrayList<>();
        if(s==null||s.length()==0) return res;
        dfs(s,0, new ArrayList<String>(), res);
        return res;
    }
    private void dfs(String s, 
                     int startIndex, 
                     List<String> partition, 
                     List<List<String>>res){
        if(startIndex == s.length()){
            res.add(new ArrayList<String>(partition));
            return ;
        }
        for(int i=startIndex;i<s.length();i++){
            String subString = s.substring(startIndex, i+1);
            if(!isPalindrome(subString)) continue;
            partition.add(subString);
            dfs(s, i+1, partition, res);
            partition.remove(partition.size()-1);
        }
    }
    private boolean isPalindrome(String s){
        for(int i=0, j=s.length()-1;i<j;i++,j--)
            if(s.charAt(i)!=s.charAt(j)) return false;
        return true;
    }
}