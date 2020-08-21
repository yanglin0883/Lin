public class Solution {
    /*
     * @param str: A string
     * @return: a boolean
     */
    public boolean isUnique(String str) {
        // write your code here
        // char[] string = str.toCharArray();
        for(int i=0;i<str.length();i++)
        {
            for(int j=i-1;j>-1;j--)
                if(str.charAt(i) == str.charAt(j)) return false;
        }
        return true;
    }
}