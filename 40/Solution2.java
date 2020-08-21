public class MyQueue {
    Stack<Integer> mem1 = new Stack<Integer>();
    Stack<Integer> mem2 = new Stack<Integer>();
    public MyQueue() {
        // do intialization if necessary
    }

    /*
     * @param element: An integer
     * @return: nothing
     */
    public void push(int element) {
        // write your code here
        mem1.push(element);
    }

    /*
     * @return: An integer
     */
    public int pop() {
        // write your code here
        if(mem2.isEmpty()){
            while(!mem1.isEmpty()){
                mem2.push(mem1.pop());
            }
        }
        return mem2.pop();
    }

    /*
     * @return: An integer
     */
    public int top() {
        // write your code here
        if(mem2.isEmpty()){
            while(!mem1.isEmpty()){
                mem2.push(mem1.pop());
            }
        }
        return mem2.peek();
    }
}