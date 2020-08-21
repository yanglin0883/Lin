public class MovingAverage {
    /*
    * @param size: An integer
    */
    LinkedList<Integer> data = new LinkedList<Integer>();
    int size;
    long sum =0;
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
        sum = sum + val;
        if(data.size() >size)
        {
            sum = sum - data.poll();
        }
        
        
        return (double)sum / (double)data.size();
    }
}