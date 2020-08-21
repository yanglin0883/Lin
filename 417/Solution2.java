public class Solution {
    /**
     * @param s: the string that represents a number
     * @return: whether the string is a valid number
     */
    public boolean isNumber(String s) {
        // write your code here
        if(s==null&&s.length()==0) return false;
        s= s.trim();
        try{
             new Double(s);
        }
        catch(Exception e){
            return false;
        }
        return true;
    }
}