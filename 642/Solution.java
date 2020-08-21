public class MovingAverage {
    /*
    * @param size: An integer
    */
    LinkedList<Integer> data = new LinkedList<Integer>();
    int size;
    public MovingAverage(int size) {
        // do intialization if necessary
        this.size = size;
    }

    /*
     * @param val: An integer
     * @return:  
     */
    public double next(int val) {
        // write your code here
        data.add(val);
        if(data.size() >size)
        {
            data.remove();
        }
        long sum =0;
        for(Integer i:data)
        {
            sum = sum + i;
        }
        return (double)sum / (double)data.size();
    }
}