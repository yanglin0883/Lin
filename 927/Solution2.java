public class Solution {
    /**
     * @param str: a string
     * @return: return a string
     */
    public char[] reverseWords(char[] str) {
        // write your code here
        if(str==null||str.length <2) return str;
        Stack<Character> temp = new Stack<Character>();
        char[] res = new char[str.length];
        int j=0;
        for(int i=str.length-1;i>-2;i--)
        {
            // System.out.println("i= "+i);
            if(i==-1||str[i]==' ')
            {
                while(!temp.isEmpty())
                {
                    res[j++] =temp.pop();
                }
                if(j<res.length) res[j++] = ' ';
            }
            else{
                temp.push(str[i]);
            }
        }
        return res;
    }
}