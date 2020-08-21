public class Solution {
    /**
     * @param s: an expression includes numbers, letters and brackets
     * @return: a string
     */
    public String expressionExpand(String s) {
        // write your code here
        if(s==null||s.length()==0) return "";
        Stack<CharSequence> ch = new Stack<>();
        Stack<Integer> times= new Stack<>();
        char[] str = s.toCharArray();
        for(int i=0;i<str.length;i++ ){
            if(Character.isDigit(str[i])){
                int j=i;
                for(;Character.isDigit(str[j]);j++);
                times.push(new Integer(s.substring(i,j)));
                i=j;
                ch.push("[");
            }
            else if(Character.isLetter(str[i])){
                int j=i;
                for(;j<str.length&&Character.isLetter(str[j]);j++);
                ch.push(s.substring(i,j));
                i=j-1;
            }
            else if(str[i]==']'){
                StringBuilder sb = new StringBuilder();
                Stack<CharSequence> temp= new Stack<>();
                while(!ch.empty()&&!ch.peek().equals("[")) temp.push(ch.pop());
                ch.pop();
                while(!temp.empty()) sb.append(temp.pop());
                int time = times.pop().intValue();
                for(int j=0;j<time;j++)ch.push(sb);
            }
        }
        StringBuilder sb = new StringBuilder();
        Stack<CharSequence> temp= new Stack<>();
        while(!ch.empty()) temp.push(ch.pop());
        while(!temp.empty()) sb.append(temp.pop());
        return sb.toString();
    }
}