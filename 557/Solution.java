public class Solution {
    /*
     * @param str: a string
     * @return: Return a hash map
     */
    public Map<Character, Integer> countCharacters(String str) {
        // write your code here
        Map<Character,Integer> res = new HashMap<Character, Integer>();
        if(str == null || str.length() ==0) return res;
        int len = str.length();
        char[] string = str.toCharArray();
        for(int i=0;i<len;i++)
        {
            Character temp = string[i];
            if(res.containsKey(temp)) res.put(temp, res.get(temp)+1);
            else res.put(temp, 1);
        }
        return res;
    }
}