public class Solution {
    /**
     * @param s: a string
     * @return: reverse only the vowels of a string
     */
    public String reverseVowels(String s) {
        // write your code here
        if(s == null|| s.length()<2) return s;
        char[] string = s.toCharArray();
        int left=0;
        int right =string.length-1;
        int len = string.length;
        while(left<right)
        {
            while(left<len&&!isVowel(string[left]))left++;
            while(0<right&&!isVowel(string[right]))right--;
            if(left<right){
                char temp = string[left];
                string[left] = string[right];
                string[right] = temp;
                left++;
                right--;
            }
            System.out.println("left= "+left+" right= "+right);
        }
        return new String(string);
    }
    
    private boolean isVowel(char ch)
    {
        switch(ch)
        {
            case 'a': case 'e': case 'i': case 'o': case 'u':
            case 'A': case 'E': case 'I': case 'O': case 'U': return true;
        }
        return false;
    }
}