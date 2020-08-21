public class Solution {
    /*
     * @param stk: an integer stack
     * @return: void
     */
    public void stackSorting(Stack<Integer> stk) {
        // write your code here
        if(stk==null || stk.size()<2) return;
        Stack<Integer> stack = new Stack<Integer>();
        while(!stk.empty())
        {
            Integer temp = stk.pop();
            while(!stack.empty() && stack.peek()<temp)
            {
                stk.push(stack.pop());
            } 
            stack.push(temp);
            // System.out.println(stk);
        }
       
        while(!stack.empty())
            stk.push(stack.pop());
        
        return;
    }
}