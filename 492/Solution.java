public class MyQueue {
    /*
     * @param item: An integer
     * @return: nothing
     */
    Queue<Integer> queue = new LinkedList<Integer>();
    public void enqueue(int item) {
        // write your code here
        queue.offer(item);
    }

    /*
     * @return: An integer
     */
    public int dequeue() {
        // write your code here
        return queue.poll().intValue();
    }
}