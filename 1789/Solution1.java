public class Solution {
    /**
     * @param names: a string array
     * @return: the string array
     */
    public String[] DistinguishUsername(String[] names) {
        // Write your code here
        if(names == null || names.length == 0) return new String[0];
        int len =names.length;
        String[] res = new String[len];
        ArrayList<String> r = new ArrayList<String>();
        for(int i=0;i<len;i++)
        {
            String temp = names[i];
            if(!r.contains(temp)){
                r.add(temp);
            } 
            else {
                for(int j=1;;j++)
                {
                    String temp1 = temp+j;
                    if(!r.contains(temp1))
                    {
                        r.add(temp1);
                        break;
                    }
                }
            }
        }
        int index=0;
        for(String i : r)
        {
            res[index++] = i;
        }
        return res;
    }
}