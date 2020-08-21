public class Solution {//暴力搜索用栈的思想
    /**
     * @param s: a string
     * @return: return a integer
     */
    public int longestValidParentheses(String s) {
        // write your code here
        if(s==null || s.length()<2) return 0;
        int max =0;
        int len = s.length(); // start with the lastest position, there is 0 of length only
        for(int i=0;i<len;i++){
            if(s.charAt(i)==')') continue;
            if(max> len-i+1) break;
            int longestSub = longestValue(s, i);
            // System.out.println("i= "+i);
            if(longestSub > max) max = longestSub;
        }
        return max;
    }
    
    private int longestValue(String s, int start){
        int res =0;
        int len = s.length();
        int num=0;
        int temp =0;
        for(int i=start;i<len;i++){
            char ch = s.charAt(i);
            if(ch=='(') num++;
            if(ch==')') num--;
            if(num<0) break;
            temp++;
            if(num==0) res = temp;
        }
        // System.out.println(res);
        return res;
    }
}