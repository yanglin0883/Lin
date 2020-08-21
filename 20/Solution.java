public class Solution {
    /**
     * @param n an integer
     * @return a list of Map.Entry<sum, probability>
     */
    public List<Map.Entry<Integer, Double>> dicesSum(int n) {
        // Write your code here
        // Ps. new AbstractMap.SimpleEntry<Integer, Double>(sum, pro)
        // to create the pair
        if(n<0)return null;
        HashMap<Integer, Double> hm = new HashMap<Integer, Double>();
        hm.put(0,1.0);
        for(int i=1;i<=n;i++)
        {
        //    System.out.println(i+"th dice:");
            addOneDice(hm);
        }
        ArrayList<Map.Entry<Integer, Double>> al = new ArrayList<Map.Entry<Integer, Double>>();
        for(Map.Entry<Integer, Double> me: hm.entrySet())
            al.add(me);
        return al;
    }
    
    private void addOneDice(HashMap<Integer, Double> hm)
    {
        Double face[]= new Double[7];
        for(int i=1;i<7;i++)
            face[i] = 1.0/6.0;
        HashMap<Integer, Double> temp = new HashMap<Integer, Double>();
        for(Integer i: hm.keySet())
        {
            for(int f=1;f<7;f++)
            {
                Integer key =i+f;
            //    System.out.print("key= "+key);
                if(temp.containsKey(key))
                {
                    temp.put(key, temp.get(key) + face[f]*hm.get(i));
                }
                else
                {
                    temp.put(key, face[f]*hm.get(i));
                }
            //    System.out.println(" value= "+temp.get(key));
            }
        }
        hm.clear();
        hm.putAll(temp);
    }
}