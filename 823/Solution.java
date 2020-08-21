public class Solution {
    /**
     * @param inputA: Input stream A
     * @param inputB: Input stream B
     * @return: The answer
     */
    public String inputStream(String inputA, String inputB) {
        // Write your code here
        if(transferString(inputA).equals(transferString(inputB))) return "YES";
        else return "NO";
    }
    
    private String transferString(String input)
    {
        char[] temp = input.toCharArray();
        StringBuilder res = new StringBuilder();
        int len =temp.length;
        int size = 0;
        for(int i=0;i<len;i++)
        {
            if(temp[i] == '<')
            {
                if(size > 0)
                {
                    res.deleteCharAt(--size);
                }
            }
            else{
                res.append(temp[i]);
                size ++;
            }
        }
        return res.toString();
    }
}