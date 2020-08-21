public class Solution {
    /**
     * @param s: the string that represents a number
     * @return: whether the string is a valid number
     */
    public boolean isNumber(String s) {
        // write your code here
        if(s==null)return false;
        s=s.trim();
        if(s.length()==0) return false;
        if(s.charAt(0)=='+'||s.charAt(0)=='-'){
            StringBuilder temp = new StringBuilder(s);
            temp.deleteCharAt(0);
            s= temp.toString();
        }
        int len =s.length();
        if(s.charAt(0)=='.'&&len==1) return false;
        boolean hasPoint=false;
        for(int i=0;i<len;i++){
            char temp = s.charAt(i);
            if(temp=='.'){
                if(hasPoint) return false;
                hasPoint = true;
            }
            else if(!isNum(temp)){
                return false;
            }
        }
        return true;
    }
    
    private boolean isNum(char ch){
        switch(ch){
            case '0':case '1':case '2':case '3':case '4':
            case '5':case '6':case '7':case '8':case '9':return true;
            default: return false;
        }
    }
}