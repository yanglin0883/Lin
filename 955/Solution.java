public class CircularQueue {
    int n=0;
    Queue<Integer> queue = new LinkedList<Integer>();
    public CircularQueue(int n) {
        // initialize your data structure here
        this.n = n;
    }
    /**
     * @return:  return true if the array is full
     */
    public boolean isFull() {
        // write your code here
        return queue.size()==n;
    }

    /**
     * @return: return true if there is no element in the array
     */
    public boolean isEmpty() {
        // write your code here
        return queue.isEmpty();
    }

    /**
     * @param element: the element given to be added
     * @return: nothing
     */
    public void enqueue(int element) {
        // write your code here
        queue.offer(element);
    }

    /**
     * @return: pop an element from the queue
     */
    public int dequeue() {
        // write your code here
        return queue.poll();
    }
}