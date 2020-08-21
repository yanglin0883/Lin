public class Stack {
    /*
     * @param x: An integer
     * @return: nothing
     */
    
    Queue<Integer> queue1 = new LinkedList<Integer>();
    Queue<Integer> queue2 = new LinkedList<Integer>();
    
    public void push(int x) {
        // write your code here
        queue1.offer(x);
    }

    /*
     * @return: nothing
     */
    public void pop() {
        // write your code here
        Integer temp;
        while(true)
        {
            temp= queue1.poll();
            if(queue1.isEmpty()) break;
            else queue2.offer(temp);
        }
        Queue<Integer> tempQ=queue1;
        queue1 = queue2;
        queue2 = tempQ;
        //return temp;
    }

    /*
     * @return: An integer
     */
    public int top() {
        // write your code here
        Integer temp = 0;
        while(!queue1.isEmpty())
        {
            temp= queue1.poll();
            queue2.offer(temp);
        }
        Queue<Integer> tempQ=queue1;
        queue1 = queue2;
        queue2 = tempQ;
        return temp.intValue();
    }

    /*
     * @return: True if the stack is empty
     */
    public boolean isEmpty() {
        // write your code here
        return queue1.isEmpty();
    }
}