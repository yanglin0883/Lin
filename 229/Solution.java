public class Solution {
    /*
     * @param stk: an integer stack
     * @return: void
     */
    public void stackSorting(Stack<Integer> stk) {
        // write your code here
        if(stk==null || stk.size()<2) return;
        int sizeOfStack = stk.size();
        int[] temp = new int[sizeOfStack];
        for(int i=0;i<sizeOfStack;i++)
        {
            temp[i] = stk.pop();
        }
        Arrays.sort(temp);
        for(int i=0;i<sizeOfStack;i++)
        {
            stk.push(temp[i]);
        }
        return;
    }
}