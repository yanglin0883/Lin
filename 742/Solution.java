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
        ArrayList<Integer> digits = new ArrayList<Integer>();
        while(temp>0)
        {
            digits.add(temp%10);
            temp /= 10;
        }
        if(digits.contains(0)) return false;
        for(Integer i: digits)
        {
            if(num % i != 0) return false;
        }
        return true;
    }
}