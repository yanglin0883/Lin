public class Solution {
    /*
     * @param string: An array of Char
     * @param length: The true length of the string
     * @return: The true length of new string
     */
    public int replaceBlank(char[] string, int length) {
        // write your code here
        // int numOfSpace=0;
        if(string == null) return 0;
        for(int i=0;i<length;i++)
        {
            if(string[i] == ' ')
            {
                // numOfSpace++;
                length += 2;
                replaceSpace(string,i,length);
            }
        }
        return length;
    }
    
    private void replaceSpace(char[] str, int index, int length)
    {
        for(int j = length-1;j>index+2;j--)
        {
            str[j] = str[j-2];
        }
        str[index] = '%';
        str[index+1] = '2';
        str[index+2] = '0';
    }
}