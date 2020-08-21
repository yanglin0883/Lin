public class Solution {
    /*
     * @param str: A string
     * @return: a boolean
     */
    public boolean isUnique(String str) {
        // write your code here
        char[] string = str.toCharArray();
        for(int i=0;i<string.length;i++)
        {
            for(int j=i-1;j>-1;j--)
                if(string[i] == string[j]) return false;
        }
        return true;
    }
}