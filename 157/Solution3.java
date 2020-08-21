public class Solution {
    /*
     * @param str: A string
     * @return: a boolean
     */
    public boolean isUnique(String str) {
        // write your code here
        // char[] string = str.toCharArray();
        ArrayList<Character> chars = new ArrayList<Character>();
        char temp;
        for(int i=0;i<str.length();i++)
        {
            temp = str.charAt(i);
            if(chars.contains(temp)) return false;
            else chars.add(temp);
        }
        return true;
    }
}