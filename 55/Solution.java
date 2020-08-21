public class Solution {
    /**
     * @param A: A string
     * @param B: A string
     * @return: if string A contains all of the characters in B return true else return false
     */
    public boolean compareStrings(String A, String B) {
        // write your code here
        int count[] = new int[26];
        for(int i=0;i<A.length();i++)
        {
            count[A.charAt(i)-'A']++;
        }
        for(int i=0;i<B.length();i++)
        {
            if(count[B.charAt(i)-'A']-- <=0) return false;
        }
        return true;
    }
}