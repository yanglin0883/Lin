public class Solution {
    /**
     * @param str: An array of char
     * @param offset: An integer
     * @return: nothing
     */
    public void rotateString(char[] str, int offset) {
        // write your code here
        if(str.length == 0)return;
        offset = offset %str.length;
        int t = str.length - offset;
        char s[] = new char[t];
        for(int i=0;i<t;i++) s[i] = str[i];
        for(int i=0;i<offset;i++){
            str[i] = str[t+i];
        }
        for(int i=offset,j=0;i<str.length;i++){
            str[i] = s[j++];
        }
    }
}