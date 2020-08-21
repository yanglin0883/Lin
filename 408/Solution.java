public class Solution {
    /**
     * @param a: a number
     * @param b: a number
     * @return: the result
     */
    public String addBinary(String a, String b) {
        // write your code here
        if(a==null||a.length()==0||b==null||b.length()==0) return "";
        StringBuilder res = new StringBuilder();
        int lenOfA = a.length();
        int lenOfB = b.length();
        boolean addOne = false;
        while(--lenOfB>-1 & --lenOfA>-1){
            int temp=0;
            if(a.charAt(lenOfA)=='1') temp++;
            if(b.charAt(lenOfB)=='1') temp++;
            if(addOne) temp++;
            if(temp>1){
                temp-=2; 
                addOne = true;
            }
            else
                addOne = false;
            res.append(temp);
        }
        //  System.out.println(res.toString()+"  :  "+lenOfA +" "+lenOfB);
        while(lenOfB>-1){
            int temp=0;
            // if(a.charAt(lenOfA)=='1') temp++;
            if(b.charAt(lenOfB)=='1') temp++;
            if(addOne) temp++;
            if(temp>1){
                temp-=2; 
                addOne = true;
            }
            else
                addOne = false;
            res.append(temp);
            lenOfB--;
        }
        while(lenOfA>-1){
            int temp=0;
            if(a.charAt(lenOfA)=='1') temp++;
            // if(b.charAt(lenOfB)=='1') temp++;
            if(addOne) temp++;
            if(temp>1){
                temp-=2; 
                addOne = true;
            }
            else
                addOne = false;
            res.append(temp);
            lenOfA--;
        }
        if(addOne) res.append('1');
        res.reverse();
        return res.toString();
    }
}