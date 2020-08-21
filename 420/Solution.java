public class Solution {
    /**
     * @param n: the nth
     * @return: the nth sequence
     */
    public String countAndSay(int n) {
        // write your code here
        StringBuilder res = new StringBuilder("1");
        for(int i=1;i<n;i++){
            res = countAnd(res);
        }
        return res.toString();
    }
    
    private StringBuilder countAnd(StringBuilder s){
        StringBuilder res = new StringBuilder();
        int len = s.length();
        char now = s.charAt(0);
        int count =1;
        for(int i=1;i<len;i++){
            if(s.charAt(i) == now){
                count++;
                continue;
            }
            res.append(count);
            res.append(now);
            now = s.charAt(i);
            count=1;
        }
        res.append(count);
        res.append(now);
        return res;
    }
}