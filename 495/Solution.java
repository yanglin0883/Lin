public class Stack {
    /*
     * @param x: An integer
     * @return: nothing
     */
    ArrayList<Integer> stack = new ArrayList<Integer>();
    int size = 0;
    public void push(int x) {
        // write your code here
        stack.add(new Integer(x));
        size++;
    }

    /*
     * @return: nothing
     */
    public void pop() {
        // write your code here
        stack.remove(--size);
    }

    /*
     * @return: An integer
     */
    public int top() {
        // write your code here
        return stack.get(size-1);
    }

    /*
     * @return: True if the stack is empty
     */
    public boolean isEmpty() {
        // write your code here
        if(size<1) return true;
        return false;
    }
}