public class Dequeue {
    public Dequeue() {
        // do intialization if necessary
    }
    LinkedList<Integer> queue = new LinkedList<Integer>();
    /*
     * @param item: An integer
     * @return: nothing
     */
    public void push_front(int item) {
        // write your code here
        queue.addFirst(new Integer(item));
    }

    /*
     * @param item: An integer
     * @return: nothing
     */
    public void push_back(int item) {
        // write your code here
        queue.addLast(new Integer(item));
    }

    /*
     * @return: An integer
     */
    public int pop_front() {
        // write your code here
        return queue.pollFirst().intValue();
    }

    /*
     * @return: An integer
     */
    public int pop_back() {
        // write your code here
        return queue.pollLast().intValue();
    }
}