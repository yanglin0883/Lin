public class TwoSum {
    /**
     * @param number: An integer
     * @return: nothing
     */
    public void add(int number) {
        // write your code here
        hm.put(number, hm.getOrDefault(number, 0)+1);
    }
    Map<Integer, Integer> hm=new HashMap();
    /**
     * @param value: An integer
     * @return: Find if there exists any pair of numbers which sum is equal to the value.
     */
    public boolean find(int value) {
        // write your code here
        for(Integer i: hm.keySet()){
            if(hm.containsKey(value-i)){
                if(i*2==value && hm.get(i)<2) continue; 
                else return true;
            }
        }
        return false;
    }
}