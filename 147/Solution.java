public class Solution {
    /**
     * @param n: The number of digits
     * @return: All narcissistic numbers with n digits
     */
    public List<Integer> getNarcissisticNumbers(int n) {
        // write your code here
        ArrayList<Integer> collection = new ArrayList<Integer>();
        if(n<1) return null;
        int begin, end;
        if(n==1)begin =0;
        else begin = time(10, n-1);
        end = time(10,n);
        for(int i=begin;i<end;i++)
        {
            if(isNarcissistic(i,n))
                collection.add(i);
        }
        return collection;
    }
    
    private boolean isNarcissistic(int n,int count)
    {
        ArrayList<Integer> digit = new ArrayList<Integer>();
        digit.add(0);
        int na = n;
        while(n>0)
        {
            digit.add(n%10);
            n/=10;
        }
        
        for(int i=0;i<digit.size();i++)
        {
            int temp = time(digit.get(i).intValue(),count);
            na-=temp;
      //      System.out.println("na="+na);
            if(na<0) return false;
        }//System.out.println(digit+"::"+count);
        if(na==0)return true;
        return false;
    }
    private int time(int a, int b)
    {
        int  res=1;
        for(int i=0;i<b;i++)
        {
            res*=a;
        }
        return res;
    }
}