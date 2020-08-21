public class MinStack {
    private Stack<Integer> stack = new Stack<Integer>();
    private Stack<Integer> min = new Stack<Integer>();
    public MinStack() {
        // do intialization if necessary
    }

    /*
     * @param number: An integer
     * @return: nothing
     */
    public void push(int number) {
        // write your code here
        stack.push(new Integer(number));
        if(min.isEmpty()|| min.peek()>=number) min.push(new Integer(number));
    }

    /*
     * @return: An integer
     */
    public int pop() {
        // write your code here
        int x = stack.pop();
        if(x==min.peek())min.pop();
        return x;
    }

    /*
     * @return: An integer
     */
    public int min() {
        // write your code here
        return min.peek();
    }
}