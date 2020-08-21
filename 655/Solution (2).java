public class Solution {
    /**
     * @param num1: a non-negative integers
     * @param num2: a non-negative integers
     * @return: return sum of num1 and num2
     */
    public String addStrings(String num1, String num2) {
        // write your code here
        char[] n1,n2;
        if(num1.length()<num2.length()){
            n1 = num1.toCharArray();
            n2 = num2.toCharArray();
        }
        else{
            n2 = num1.toCharArray();
            n1 = num2.toCharArray();
        }
        ArrayList<Character> res = new ArrayList<Character>();
        int addOne =0;
        int len1 = n1.length-1;
        int len2 = n2.length-1;

        while(len1>-1){
            int temp = n1[len1--]-'0'+n2[len2--]-'0'+addOne;
            if(temp<10) {
                res.add(new Character((char)(temp+'0')));
                addOne = 0;
            }
            else{
                res.add(new Character((char)(temp+'0'-10)));
                addOne = 1;
            }
        }
        while(len2>-1){
            int temp = n2[len2--]-'0'+addOne;
            if(temp<10) {
                res.add(new Character((char)(temp+'0')));
                addOne = 0;
            }
            else{
                res.add(new Character((char)(temp+'0'-10)));
                addOne = 1;
            }
        }
        if(addOne == 1) res.add('1');
        StringBuilder sb = new StringBuilder();
        for(int i=res.size()-1;i>-1;i--)
            sb.append(res.get(i));
        return sb.toString();
    }
}