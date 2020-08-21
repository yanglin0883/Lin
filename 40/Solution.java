public class MyQueue {
    Queue<Integer> mem = new LinkedList<Integer>();
    public MyQueue() {
        // do intialization if necessary
    }

    /*
     * @param element: An integer
     * @return: nothing
     */
    public void push(int element) {
        // write your code here
        mem.offer(element);
    }

    /*
     * @return: An integer
     */
    public int pop() {
        // write your code here\
        return mem.poll();
    }

    /*
     * @return: An integer
     */
    public int top() {
        // write your code here
        return mem.peek();
    }
}