public class Solution {
    /**
     * @param s: the string
     * @param k: the integer k
     * @return: the answer
     */
    public String reverseStringII(String s, int k) {
        // Write your code here.
        if(s == null || s.length() == 0 ||k<2) return s;
        char[] string = s.toCharArray();
        StringBuilder res = new StringBuilder();
        int len = string.length;//the length of rest part
        int i=0;// initial of rest part
        while(len > 0)
        {
            StringBuilder temp = new StringBuilder();
            
            if(len <=k)
            {
                temp.append(string, i, string.length-i);
                temp.reverse();
                len = -1;
            }
            else if(len <= 2*k)
            {
                // System.out.println("i= "+i+" i+k= "+(i+k));
                temp.append(string, i, k);
                temp.reverse();
                temp.append(string, i+k, string.length-i-k);
                len = -1;
            }
            else{
                temp.append(string, i, k);
                temp.reverse();
                // System.out.println(temp.toString()+" s= "+i+" e= "+(i+k));
                temp.append(string, (i+k),k);
                // System.out.println(temp.toString()+" s= "+(i+k)+" e= "+(i+2*k));
                i+=2*k;
                len -= 2*k;
            }
            // System.out.println(temp.toString());
            res.append(temp);
            // System.out.println("len= "+len+" i= "+i);
            // System.out.println(res.toString());
        }
        return res.toString();
    }
}