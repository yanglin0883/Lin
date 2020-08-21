public class Solution {
    /**
     * @param num: a positive number
     * @return: true if it's a palindrome or false
     */
    public boolean isPalindrome(int num) {
        // write your code here
        String n = Integer.toString(num);
        int i=0;
        int j=n.length()-1;
        while(n.charAt(i) == n.charAt(j))
        {
            i++;j--;
            if(i>=j) return true;
            
        }
        return false;
    }
}