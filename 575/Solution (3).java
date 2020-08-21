public class Solution {
    /**
     * @param s: an expression includes numbers, letters and brackets
     * @return: a string
     */
    public String expressionExpand(String s) {
        // write your code here
        if(s==null|| s.length()<3) return s;
        Stack<Integer> numStack  = new Stack();
        Stack<String> strStack = new Stack();
        String str="";
        int num=0;
        for(char c:s.toCharArray()){
            if(c>='0'&&c<='9'){
                num = num *10+c-'0';
            }else if(c=='['){
                numStack.push(num);
                strStack.push(str);
                num=0;
                str = "";
            }else if(c==']'){
                int count = numStack.pop();
                String temp = strStack.pop();
                for(int i=0;i<count;i++) temp+=str;
                str = temp;
            }else{
                str += c;
            }
        }
        return str;
    }
}