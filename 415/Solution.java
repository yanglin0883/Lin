public class Solution {
    /**
     * @param s: A string
     * @return: Whether the string is a valid palindrome
     */
    public boolean isPalindrome(String s) {
        // write your code here
        if(s == null) return false;
        if(s.length() ==0) return true;
        StringBuilder str = new StringBuilder();
        int len = s.length();
        for(int i=0;i<len;i++)
        {
            char temp = s.charAt(i);
            if(temp>='a' &&temp<='z')
                str.append(temp);
            else if(temp>='A' &&temp<='Z')
                str.append((char)(temp-'A'+'a'));
            else if(temp>='0' &&temp<='9')
                str.append(temp);
        }
    //    System.out.println(str.length()+"");
        if(str.length()<1) return true;
        int i=0;
        int j=str.length()-1;
        while(str.charAt(i)==str.charAt(j))
        {
            i++;
            j--;
            if(i>=j) return true;
        }
        return false;
    }
}