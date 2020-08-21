public class CircularQueue {
    int n=0;
    int[] queue;
    int front = 0;
    int rear = 0;
    int len =0;
    public CircularQueue(int n) {
        // initialize your data structure here
        this.n = n;
        queue = new int[n];
    }
    /**
     * @return:  return true if the array is full
     */
    public boolean isFull() {
        // write your code here
        return len == n;
    }

    /**
     * @return: return true if there is no element in the array
     */
    public boolean isEmpty() {
        // write your code here
        return len==0;
    }

    /**
     * @param element: the element given to be added
     * @return: nothing
     */
    public void enqueue(int element) {
        // write your code here
        queue[rear]=element;
        rear = (rear+1)%n;
        len++;
    }

    /**
     * @return: pop an element from the queue
     */
    public int dequeue() {
        // write your code here
        len--;
        int temp = front;
        front = (front+1)%n;
        return queue[temp];
    }
}