public class DataStream {
    
    private class Data{
        int data;
        boolean isUnique=true;;
        Data(int num, boolean o)
        {
            data = num;
            isUnique = o;
        }
        public boolean equals(Object o)
        {
            if(o instanceof Data){
                Data p = (Data) o;
                return (p.data == this.data)? true: false;
            }
            if(o instanceof Integer){
                Integer p = (Integer) o;
                return (p.intValue() == this.data)? true: false;
            }
            return false;
        }
    }
    
    ArrayList<Data> data = new ArrayList<Data>();
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
        
        for(int i=0;i<size;i++)
        {
            if(data.get(i).data == num)
            {
                data.get(i).isUnique = false;
                data.add(new Data(num, false));
                size++;
                return;
            }
        }
        data.add(new Data(num,true));
        size++;
    }

    /**
     * @return: the first unique number in stream
     */
    public int firstUnique() {
        // write your code here
        for(int i=0;i<size;i++)
        {
            if(data.get(i).isUnique) return data.get(i).data;
        }
        return 2147483647;
    }
}