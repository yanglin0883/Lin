public class Solution {
    /**
     * @param names: a string array
     * @return: a string array
     */
    public List<String> nameDeduplication(String[] names) {
        // write your code here
        List<String> res = new ArrayList<String>();
        if(names == null || names.length ==0) return res;
        int len = names.length;
        for(int i=0;i<len;i++)
        {
            String temp = names[i].toLowerCase();
            if(!res.contains(temp)) res.add(temp);
        }
        return res;
    }
}