public class Solution {
    /*
     * @param nums: Given an integers array A
     * @return: A long long array B and B[i]= A[0] * ... * A[i-1] * A[i+1] * ... * A[n-1]
     */
    public List<Long> productExcludeItself(List<Integer> nums) {
        // write your code here
        if(nums.size() == 0)
            return null;
        List<Long> al = new ArrayList<Long>();
        if(nums.size()==1)
        {
            al.add(new Long(1));
            return al;
        }
        if(nums.contains(0))
        {
            int times=0;
            for(Integer i: nums)
            {
                if(i == 0) times++;
            }
            if(times > 1)
            {
                for(int j =0; j<nums.size();j++)
                    al.add(new Long(0));
                return al;
            }
            if(times == 1)
            {
                int index = nums.indexOf(0);
                long mul=1;
                for(int j =0; j<index;j++)
                    al.add(new Long(0));
                for(Integer j : nums)
                {
                    if(j != 0)
                        mul = mul *j;
                }
                al.add(new Long(mul));
                for(int j =index+1; j<nums.size();j++)
                    al.add(new Long(0));
                return al;
            }
        }
        long mul =1;
        for(Integer i : nums)
        {
            mul = mul * i;
        }
        for(int i=0;i<nums.size();i++)
        {
            al.add(div2(mul, nums.get(i)));
        }
        return al;
    }
    
    private Long div2(long mul, Integer a)
    {
        return new Long(mul/ a.intValue());
    }
    
    private Long div(long mul, Integer a)
    {
        if(mul == 0) return new Long(0);
        int signal =1;
        if(mul<0) 
        {
            signal*=-1;
            mul*=-1;
        }
        if(a<0) 
        {
            signal*=-1;
            a = -a;
        }
        long quotient=0;
        while(mul>0)
        {
            mul = mul - a;
            quotient++;
        }
        if(mul<0)
            quotient--;
        return new Long(quotient * signal);
    }
}