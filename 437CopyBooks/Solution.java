public class Solution {
    /**
     * @param pages: an array of integers
     * @param k: An integer
     * @return: an integer
     */
    public int copyBooks(int[] pages, int k) {
        // write your code here
        if(pages.length ==0) return 0;
    //    if(k == 0) throw RuntimeException("infinate time");
        if(k>= pages.length) return max(pages);
        int minute;
        minute = getMinute(pages, k);
        return minute;
    }
    
    private int max(int a[])
    {
        int res=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(res<a[i])
                res = a[i];
        }
        return res;
    }
    
    private int getMinute(int[] pages, int k)
    {
        long min;
        min=pages[0]; //min of minute means max of every page
        long max=0;//max of minute means only one person for whole mission
        for(int i=0;i<pages.length;i++)
        {
            max += pages[i];
            if(pages[i]>min)
                min = pages[i];
        }
        long mid = (min + max) >> 1;
        while(min<=max)
        {
            mid = (min+max) >> 1;
            if(judge(mid, pages, k))
                max = mid-1;
            else
                min = mid+1;
            System.out.println("min= "+min+" mid= "+mid+ " max= "+max);
        }
        if(!judge(mid, pages,k))
            return (int)mid+1;
        return (int)mid;//most saving-time
    }
    
    private boolean judge(long time, int[] pages, int k)//if in time, k person can finish,then true 
    {
        long temp = time;
        int iterator=0;
        for(int i=0;i<pages.length;)
        {
            temp = time;
            for(;i<pages.length&&pages[i] <= temp;i++)
            {
                    temp = temp - pages[i];
            }
            iterator++;
            System.out.println("time= "+time+" temp= "+temp+" iterator= "+iterator+" i= "+i);
        }
        System.out.println(iterator <= k);
        return iterator <= k;
    }
}