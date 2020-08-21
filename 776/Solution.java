public class Solution {
    /**
     * @param n: the length of strobogrammatic number
     * @return: All strobogrammatic numbers
     */
    public List<String> findStrobogrammatic(int n) {
        // write your code here
        List<String> res = new ArrayList<String>();
        if(n<1) {
            res.add("");
            return res;
        }
        if(n==1) {
            res.add("0");
            res.add("1");
            res.add("8");
            return res;
        }
        long start= times(n-1);
        long end = times(n);
        for(long i=start;i<end;i++)
        {
            String temp = new Long(i).toString();
            if(isStrobogrammatic(temp)) res.add(temp);
        }
        return res;
    }
    
    private long times(int n)
    {
        long res =1;
        for(int i=0;i<n;i++)
        {
            res *=10;
        }
        return res;
    }
    
    private boolean isStrobogrammatic(String num) {
        // write your code here
        if(num==null||num.length()<1 || num.charAt(0)=='-') return false;
        char[] number = num.toCharArray();
        int left =0;
        int right = number.length-1;
        char[][] judge = {{'0','0'},{'1','1'},{'6','9'},{'8','8'},{'9','6'}};
        
        while(left<=right)
        {
            boolean flag =false;
            for(int i=0;i<5;i++)
            {
                if(number[left] == judge[i][0] && number[right]==judge[i][1]) flag = true;
                //真的可以倒置
            }
            if(!flag) return false;
            left++; right--;
        }
        return true;
    }
}