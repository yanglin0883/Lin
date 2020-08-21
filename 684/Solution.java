public class Solution {
    /**
     * @param str1: a given string
     * @param str2: another given string
     * @return: An array of missing string
     */
    public List<String> missingString(String str1, String str2) {
        // Write your code here
        ArrayList<String> res = new ArrayList<String>();
        if(str1==null||str1.length() ==0) return res;
        if(str2==null||str2.length() ==0){
            res.add(str1);
            return res;
        }
        String[] s1 = str1.split(" ");
        String[] s2 = str2.split(" ");
        for(int i=0;i<s1.length;i++){
            boolean flag = true;
            for(int j=0;j<s2.length;j++){
                if(s1[i].equals(s2[j])){
                    flag = false;
                    break;
                }
            }
            if(flag) res.add(s1[i]);
        }
        return res;
    }
}