public class Solution {
    /*
     * @param chars: The letter array you should sort by Case
     * @return: nothing
     */
    public void sortLetters(char[] chars) {
        // write your code here
        if(chars ==null || chars.length == 0) return;
        int len  = chars.length;
        char[] lower =new char[len];
        char[] upper =new char[len];
        int lenOfL=0;
        int lenOfU=0;
        for(int i=0;i<len;i++)
        {
            if(chars[i]<'a')
            {
                upper[lenOfU++]= chars[i];
            }
            else
            {
                lower[lenOfL++]=chars[i];
            }
        }
        for(int i=0;i<lenOfL;i++)
        {
            chars[i] =lower[i];
        }
        for(int i=lenOfL;i<len;i++)
        {
            chars[i] = upper[i-lenOfL];
        }
    }
}