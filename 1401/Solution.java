public class Solution {
    /**
     * @param str: the origin string
     * @return: the start and end of every twitch words
     */
    public int[][] twitchWords(String str) {
        // Write your code here
        if(str==null || str.length()<2){ int[][] res = null;return res;}
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        char[] s = str.toCharArray();
        int len = s.length;
        int fast =0;
        int slow=0;
        int count = 1;
        while(++fast<len)
        {
            if(s[fast] == s[slow])
            {
                while(++fast<len&&s[fast]==s[slow]);
                if(fast == len +1){
                    fast--;
                    if(fast - slow > 2)
                    {
                        ArrayList<Integer> temp = new ArrayList<Integer>();
                        temp.add(slow);
                        temp.add(fast);
                        res.add(temp);
                    }
                    break;
                }
                if(fast - slow > 2)
                {
                    ArrayList<Integer> temp = new ArrayList<Integer>();
                    temp.add(slow);
                    temp.add(fast-1);
                    res.add(temp);
                }
            }
            slow = fast;
        }
        System.out.println(res);
        int size = res.size();
        int[][] ans = new int[size][2];
        for(int i=0;i<size;i++)
        {
            ans[i]= new int[2];
            ans[i][0] = res.get(i).get(0);
            ans[i][1] = res.get(i).get(1);
        }
        return ans;
    }
}