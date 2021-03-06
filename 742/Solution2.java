public class Solution {
    /**
     * @param lower: Integer : lower bound
     * @param upper: Integer : upper bound
     * @return: a list of every possible Digit Divide Numbers
     */
    public List<Integer> digitDivideNums(int lower, int upper) {
        // write your code here
        ArrayList<Integer> res = new ArrayList<Integer>();
        if(lower>upper) return res;
        if(lower>2147482999){
            if(upper>=2147483184&&lower<=2147483184)
            {
                res.add(2147483184);
            }
            return res;
        }
        for(int i =lower;i<=upper;i++)
        {
            
            if(isNum(i)) res.add(i);
        }
        return res;
    }
    private boolean isNum(int num)
    {
        if(num==0) return false;
        int temp = num;
        if(temp<0) temp = -temp;
    //    ArrayList<Integer> digits = new ArrayList<Integer>();
        while(temp>0)
        {
            int i= temp%10;
            if(i==0) return false;
            if(num % i != 0) return false;
            temp /= 10;
        }
        // if(digits.contains(0)) return false;
        // for(Integer i: digits)
        // {
            
        // }
        return true;
    }
}