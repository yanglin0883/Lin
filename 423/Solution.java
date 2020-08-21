public class Solution {
    /**
     * @param s: A string
     * @return: whether the string is a valid parentheses
     */
    public boolean isValidParentheses(String s) {
        // write your code here
        if(s==null || s.length()==0) return true;
        Stack<Character> temp = new Stack<Character>();
        int len = s.length();
        for(int i=0;i<len;i++){
            char c = s.charAt(i);
            // System.out.println(c+" "+temp);
            switch(c){
                case '(': case '[': case '{': temp.push(c);break;
                default: 
                    if(temp.isEmpty()) return false;
                    // System.out.println(c+" "+match(c, temp.pop().charValue()));
                    if(!match(c, temp.pop().charValue())) return false;
            }
        }
        if(!temp.isEmpty()) return false;
        return true;
    }
    
    private boolean match(char ch2, char ch1){
        // System.out.println(ch1+"::"+ch2);
        if(ch1=='('&&ch2 ==')'||
            ch1=='['&&ch2 ==']'||
            ch1=='{'&&ch2 =='}') return true;
        else return false;
    }
}