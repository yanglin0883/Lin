public class Solution {
    /*
     * @param s: A string
     * @return: A list of lists of string
     */
    public List<List<String>> partition(String s) {
        // write your code here
        List<List<String>> res = new ArrayList<>();
        if(s==null||s.length()==0) return res;
        getIsPalindrome(s);
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
            if(!isPalindrome[startIndex][i]) continue;
            String subString = s.substring(startIndex, i+1);
            partition.add(subString);
            dfs(s, i+1, partition, res);
            partition.remove(partition.size()-1);
        }
    }
    boolean isPalindrome[][];
    private void getIsPalindrome(String s){
        int n = s.length();
        isPalindrome= new boolean[n][n];
        for(int i=0;i<n;i++)
            isPalindrome[i][i] = true;
        for(int i=0;i<n-1;i++)
            isPalindrome[i][i+1] = (s.charAt(i) == s.charAt(i+1));
        for(int i=n-3;i>-1;i--)
            for(int j=i+2;j<n;j++)
                isPalindrome[i][j] = isPalindrome[i+1][j-1]&&s.charAt(i)==s.charAt(j);
    }
}