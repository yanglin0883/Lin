public class Solution {
    /**
     * @param n: the length of strobogrammatic number
     * @return: All strobogrammatic numbers
     */
    public List<String> findStrobogrammatic(int n) {
        // write your code here
        List<String> res = new ArrayList<String>();
        if(n<1){ res.add(""); return res;}
        if(n%2 == 0) res.add("");
        else {
            res.add("0");
            res.add("1");
            res.add("8");
        }
        n=n/2;
        for(int i=1;i<=n;i++)
        {
            List<String> temp = new ArrayList<String>();
            for(String s: res)
            {
                temp.add("1"+s+"1");
                temp.add("6"+s+"9");
                temp.add("8"+s+"8");
                temp.add("9"+s+"6");
                if(i!=n)temp.add("0"+s+"0");
            }
            res = temp;
        }
        return res;
    }
}