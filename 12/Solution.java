public class MinStack {
    private Stack<Integer> stack = new Stack<Integer>();
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
    }

    /*
     * @return: An integer
     */
    public int pop() {
        // write your code here
        return stack.pop();
    }

    /*
     * @return: An integer
     */
    public int min() {
        // write your code here
        int n=stack.size();
        if(n==0) return -1;
        int min = stack.get(0);
        for(int i=1;i<n;i++)
        {
            int temp = stack.get(i);
            if(temp < min)min = temp;
        }
        return min;
    }
}