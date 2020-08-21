public class Solution {
    /**
     * @param s: an expression includes numbers, letters and brackets
     * @return: a string
     */
    public String expressionExpand(String s) {
        // write your code here
        if(s==null||s.length()==0) return "";
        StringBuilder sb= new StringBuilder();
        int i=0;
        while(i<s.length()&&s.charAt(i)>='A') i++;
        if(i==s.length()) return s;
        int k=i;
        while(s.charAt(k)!='[')k++;
        int j=s.length()-1;
        int stack=1;
        for(j=k+1;j<s.length()&&stack!=0;j++){
            if(s.charAt(j)=='[') stack++;
            else if(s.charAt(j)==']') stack--;
        }
        j--;
        //System.out.println(s+" : "+i+" "+j+" "+k);
        sb.append(s.substring(0, i));
        int times = Integer.parseInt(s.substring(i, k));
        String temp = expressionExpand(s.substring(k+1,j));
        for(int a=0;a<times;a++)
            sb.append(temp);
        sb.append(expressionExpand(s.substring(j+1, s.length())));
        return sb.toString();
    }
}