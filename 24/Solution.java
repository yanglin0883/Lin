public class LFUCache {
    /*
    * @param capacity: An integer
    */
    int capacity;
    ArrayList<ArrayList<Integer>> cache = new ArrayList<ArrayList<Integer>>();
    public LFUCache(int capacity) {
        // do intialization if necessary
        this.capacity = capacity;
    }

    /*
     * @param key: An integer
     * @param value: An integer
     * @return: nothing
     */
    public void set(int key, int value) {
        // write your code here
        if(cache.size() < capacity)
        {
            ArrayList<Integer> al = new ArrayList<Integer>();
            al.add(new Integer(key));
            al.add(new Integer(value));
            al.add(new Integer(1));
            cache.add(al);
        }
        else{
            int min =0;
            for(int i=1;i<capacity;i++)
            {
                if(cache.get(i).get(2).intValue() < cache.get(min).get(2).intValue())
                    min = i;
            }
            cache.remove(min);
            ArrayList<Integer> al = new ArrayList<Integer>();
            al.add(new Integer(key));
            al.add(new Integer(value));
            al.add(new Integer(1));
            cache.add(al);
        }
//        for(int i=0;i<cache.size();i++)
//        System.out.println(cache.get(i));
//        System.out.println();
    }

    /*
     * @param key: An integer
     * @return: An integer
     */
    public int get(int key) {
        // write your code here
        for(int i=0;i<cache.size();i++)
        {
            if(cache.get(i).get(0)==key)
            {
                cache.get(i).set(2,cache.get(i).get(2)+1);
 //               for(int i1=0;i1<cache.size();i1++)
 //               System.out.println(cache.get(i1));
 //               System.out.println();
                return cache.get(i).get(1).intValue();
            }
        }
        return -1;
    }
}