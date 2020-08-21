public class Solution {
    /**
     * @param str: A string
     * @return: A string
     */
    public String lowercaseToUppercase2(String str) {
        // write your code here
        char[] string = str.toCharArray();
        int len = string.length;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<len;i++)
        {
            if(string[i]>='a' && string[i]<='z')
                sb.append((char)(string[i]-'a'+'A'));
            else sb.append(string[i]);
        }
        return sb.toString();
    }
}