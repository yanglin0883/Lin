public class DataStream {
    
    ArrayList<Integer> data = new ArrayList<Integer>();
    ArrayList<Boolean> isUnique = new ArrayList<Boolean>();
    int size = 0;
    public DataStream(){
        // do intialization if necessary
    }
    /**
     * @param num: next number in stream
     * @return: nothing
     */
    public void add(int num) {
        // write your code here
        size++;
        if(data.contains(num))
        {
            isUnique.add(false);
            isUnique.set(data.indexOf(num), false);
        }
        else
            isUnique.add(true);
        data.add(num);
    }

    /**
     * @return: the first unique number in stream
     */
    public int firstUnique() {
        // write your code here
        for(int i=0;i<size;i++)
        {
            if(isUnique.get(i)) return data.get(i);
        }
        return 2147483647;
    }
}