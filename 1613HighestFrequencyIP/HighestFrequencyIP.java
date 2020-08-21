public class Solution {
    /**
     * @param ipLines: ip  address
     * @return: return highestFrequency ip address
     */
    public String highestFrequency(String[] ipLines) {
        // Write your code here
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        for(int i = 0;i < ipLines.length; i++){
            if(hm.containsKey(ipLines[i]))
            {
                hm.put(ipLines[i], hm.get(ipLines[i]) + 1);
            }
            else hm.put(ipLines[i],1);
        }
        
        String str = ipLines[0];
        int frequency = 1;
        for(String i : hm.keySet())
        {
            if(hm.get(i) > frequency)
            {
                str = i;
                frequency = hm.get(i);
            }
        }
        return str;
    }
}