public class Solution {
    /**
     * @param L: Given n pieces of wood with length L[i]
     * @param k: An integer
     * @return: The maximum length of the small pieces
     */
    public int woodCut(int[] L, int k) {
        // write your code here
        if(L.length == 0)
            return 0;
        long sum=0;
        int maxIndex=0;
        for(int i=0;i<L.length;i++)
        {
            sum+=L[i];
            // System.out.println(i);
            if(L[i]>L[maxIndex])
                maxIndex = i;
        }
        if(sum<k)if(k>L[maxIndex])
            return 0;
        if(sum == k)
            return 1;
        int res = L[maxIndex];
        System.out.println(maxIndex);
        res = bineraySearch(res,L,k);
        return res;
    }
    
    private int search(int res, int[] L,int k)
    {
        while(!judge(res, L, k))//we could use bineray search here
        {
            res--;
            System.out.println("res="+res);
        }
        return res;
    }
    
    private int bineraySearch(int res, int[] L,int k)
    {
        long min=0;
        long max=res;
        long mid=(min+max)>>1;
        boolean flag =false;
        while(min<max)
        {
            mid=(min+max)>>1;
            flag=judge((int)mid,L,k);
            if(flag)
                min =mid+1;
            else
                max =mid;
            
            System.out.println("min= "+min+" mid= "+mid+" max= "+max);
        }
        if(flag) return (int)mid;
        else return (int)mid-1;
    }
    
    private boolean judge(int len, int[] L, int k)
    {
        long sum=0;
        System.out.println("len = "+len);
        for(int i =0;i<L.length;i++)
        {
           sum+= L[i]/ len;
        }
        System.out.println("sum = "+sum);
        return sum>=k;
    }
}