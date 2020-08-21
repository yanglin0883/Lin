public class Solution {
    /**
     * @param num: a number
     * @param k: the k digits
     * @return: the smallest number
     */
    public String removeKdigits(String num, int k) {
        // write your code here.
        if(k<=0) return num;
        if(k>=num.length()) return "0";
        StringBuilder min = new StringBuilder();
        char[] str = num.toCharArray();
        int start=0;
        while(k<str.length-start){
            //System.out.println(k+"  "+start+" "+min.toString());
            int m = start;
            for(int i=1;i<=k;i++){
                if(str[start+i]<str[m]) m = i+start;
            }
            k-=m-start;
            min.append(str[m]);
            start = m+1;
        }
        int i=0;
        for(;i<min.length()&&min.charAt(i)=='0';i++);
        min.delete(0,i);
        if(min.length()==0) return "0";
        return min.toString();
    }
}