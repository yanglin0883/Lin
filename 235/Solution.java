public class Solution {
    /**
     * @param num: An integer
     * @return: an integer array
     */
    public List<Integer> primeFactorization(int num) {
        // write your code here
        if(num == 1 || num <0)return null;
        List<Integer> res = new ArrayList<Integer>();
        if(num == 0) {res.add(0);return res;}
        List<Integer> prime = new ArrayList<Integer>();
        int range = (num >>1) +1;
        T1:for(int i=2;i<range;i++)
        {
            for(Integer j: prime)
            {
                if(i%j==0) continue T1;
            }
            prime.add(i);
        }
        for(Integer i: prime)
        {
            while(num%i == 0)
            {
                num = num / i;
                res.add(i);
            }
        }
        if(res.isEmpty()) res.add(num);
        return res;
    }
}