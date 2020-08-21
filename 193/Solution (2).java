public class Solution { // stack²Ù×÷
    /**
     * @param s: a string
     * @return: return a integer
     */
    public int longestValidParentheses(String s) {
        // write your code here
        if(s==null&&s.length()<2) return 0;
        int max =0;
        Stack<Integer> stack = new Stack();
        s= ")"+s;
        for(int i=0;i<s.length();i++){
            char temp = s.charAt(i);
            if(temp=='(') stack.push(i);
            else {
                if(stack.isEmpty()){
                    stack.push(-i);
                    continue;
                }
                
                if(stack.peek()>0){
                    stack.pop();
                    int len  = i-Math.abs(stack.peek());
                    max= Math.max(max, len);
                }
                else{
                    stack.push(-i);
                }
                // else{
                //     max = Math.max(max, stack.peek()+i);
                //     stack.push(-i);
                // }
                // stack.push(-i);
            }
            // System.out.println(stack.peek());
        }
        return max;
    }
}