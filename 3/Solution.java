public class Solution {
    /**
     * @param k: An integer
     * @param n: An integer
     * @return: An integer denote the count of digit k in 1..n
     */
    public int digitCounts(int k, int n) {
        // write your code here
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<=n;i++)
        {
            sb.append(i);
        }
        int sum=0;
        char k1;
        k1 = (char)(k+'0');
        for(int i=0;i<sb.length();i++)
        {
            if(sb.charAt(i) == k1) sum++;
        }
        return sum;
    }
}