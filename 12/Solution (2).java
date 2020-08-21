public class MinStack {
    Stack<int[]> stack = new Stack<>();
    Stack<int[]> min = new Stack<>();
    public MinStack() {
        // do intialization if necessary
    }

    /*
     * @param number: An integer
     * @return: nothing
     */
    public void push(int number) {
        // write your code here
        int[] ele = {number};
        stack.push(ele);
        if(min.empty()||min.peek()[0]>ele[0])
            min.push(ele);
    }

    /*
     * @return: An integer
     */
    public int pop() {
        // write your code here
        if(stack.peek()==min.peek())
            min.pop();
        return stack.pop()[0];
    }

    /*
     * @return: An integer
     */
    public int min() {
        // write your code here
        return min.peek()[0];
    }
}