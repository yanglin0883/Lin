public class Solution {
    /**
     * @param s: A string
     * @return: Whether the string is a valid palindrome
     */
    public boolean isPalindrome(String s) {
        // write your code here
        if(s==null || s.length()<2) return true;
        int left =0, right = s.length()-1;
        s = s.toLowerCase();
        while(left<right){
            while(left<right&&!isLetter(s.charAt(left)))left++;
            while(left<right&&!isLetter(s.charAt(right)))right--;
            if(s.charAt(left++)!=s.charAt(right--)) return false;
            //stem.out.println(left+" "+right);
        }
        return true;
    }
    private boolean isLetter(char a){
        return a>='a'&&a<='z' || a>='0'&&a<='9';
    }
}