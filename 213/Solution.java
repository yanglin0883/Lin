
public class Solution {
    /**
     * @param originalString: a string
     * @return: a compressed string
     */
    public String compress(String originalString) {
        // write your code here
        if(originalString == null || originalString.length()<2) return originalString;
        char[] str = originalString.toCharArray();
        StringBuilder res = new StringBuilder();
        char temp=str[0];
        int num=1;
        int len = str.length;
        for(int i=1;i<len;i++){
            if(str[i] == temp){
                num++;
            }
            else{
                res.append(temp);
                res.append(num);
                temp = str[i];
                num=1;
            }
        }
        res.append(temp);
        res.append(num);
        if(res.length()< len)return res.toString();
        return originalString;
    }
}