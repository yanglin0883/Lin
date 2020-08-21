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
        Map<String, Integer> hm = new HashMap<String,Integer>();
        for(int i=0;i<len;i++)
        {
            if(!hm.containsKey(names[i]))
            {
                hm.put(names[i],0);
                res[i]= names[i];
            }
            else{
                Integer temp = hm.get(names[i]) + 1;
                res[i] = names[i] + temp.toString();
                hm.put(names[i], temp);
            }
        }
        return res;
    }
}