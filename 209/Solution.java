public class Solution {
    /**
     * @param str: str: the given string
     * @return: char: the first unique character in a given string
     */
    public char firstUniqChar(String str) {
        // Write your code here
        char[] s= str.toCharArray();
        int len = s.length;
        boolean[] judge = new boolean[len];
        for(int i=0;i<len;i++)
        {
            if(!judge[i])
            {
                for(int j=i+1;j<len;j++)
                {
                    if(!judge[j] && s[j] == s[i])
                    {
                        judge[i]=true;
                        judge[j]=true;
                        // break;//我以为是一对一对的
                    }
                }
            }
            if(! judge[i]) return s[i];
        }
        return s[len-1];
    }
}