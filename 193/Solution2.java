public class Solution {//kmpÀ„∑®
    /**
     * @param s: a string
     * @return: return a integer
     */
    public int longestValidParentheses(String s) {
        // write your code here
        if(s==null || s.length()<2) return 0;
        char[] ch = s.toCharArray();
        boolean[] flag = new boolean[ch.length];
        for(int i=0;i<ch.length;i++){
            if(ch[i]==')'){
                for(int j=i-1;j>-1;j--){
                    if(flag[j]==false && ch[j]==')') break;
                    if(flag[j]==false&&ch[j]=='('){
                        flag[i] = true;
                        flag[j] = true;
                        // System.out.println("i= "+i+" j= "+j);
                        break;
                    }
                }
            // sop(flag);
            }
        }
        int count=0;
        int max =0;
        for(int i=0;i<flag.length;i++){
            if(flag[i]) count++;
            else count=0;
            if(count>max) max = count;
            // System.out.println(flag[i]);
        }
        //sop(flag);
        return max;
    }
    //  private void sop(boolean[] a){
    //     for(int i=0;i<a.length;i++)
    //         System.out.print(a[i]+", ");
    //     System.out.println();
    //}
}