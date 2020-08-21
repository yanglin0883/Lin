public class Solution {
    /**
     * @param s: a string
     * @return: it's index
     */
    public int firstUniqChar(String s) {
        // write your code here
        if(s ==null||s.length()<2) return -1;
        char[] str = s.toCharArray();
        int len = str.length;
        boolean[] judge = new boolean[len];
        
        // System.out.println(len+" :: "+str[320]);
        for(int i=0;i<len;i++)
        {
            if(!judge[i])
            for(int j=i+1;j<len;j++)
            {
                if(!judge[j] && str[j] == str[i])
                {
                    judge[i] =true;
                    judge[j] = true;
                }
            }
            
            if(!judge[i]) {
                // System.out.println(str[i]+" ;; "+i);
                return i;
                
            }
        }
        return -1;
    }
}