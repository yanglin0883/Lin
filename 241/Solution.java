public class Solution {
    /**
     * @param str: A string
     * @return: An integer
     */
    public int stringToInteger(String str) {
        // write your code here
        char num[] = str.toCharArray();
        int res=0;
        if(num[0] == '-')
        {
            int len = num.length;
            for(int i=0;i<len-1;i++)
            {
                res = res+ digit(i)*(int)(num[len-i-1]-'0');
            }
            res = -res;
        }
        else
        {
            int len = num.length;
            for(int i=0;i<len;i++)
            {
                res = res+ digit(i)*(int)(num[len-i-1]-'0');
            }
        }
        return res;
    }
    private int digit(int i)
    {
        int result=1;
        for(int j=0;j<i;j++) result*=10;
        return result;
    }
}