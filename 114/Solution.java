public class Solution {
    /**
     * @param m: positive integer (1 <= m <= 100)
     * @param n: positive integer (1 <= n <= 100)
     * @return: An integer
     */
    public int uniquePaths(int m, int n) {
        // write your code here
        if(m<2 || n <2) return 1;
        int map[] = new int[m];
        for(int i=0;i<m;i++)
        {
            map[i] = 1;
        }
        
        for(int i=1;i<n;i++)
        {
            int temp[] = new int[m];
            temp[0]=1;
            for(int j=1;j<m;j++)
            {
                temp[j] = temp[j-1] + map[j];
            }
            map = temp;
        //    sop(map);
        }
        
        return map[m-1];
    }
    
    private void  sop(int a[])
    {
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" , ");
        System.out.println();
    }
}