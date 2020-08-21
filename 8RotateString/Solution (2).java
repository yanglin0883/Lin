public class Solution {
    /**
     * @param str: An array of char
     * @param offset: An integer
     * @return: nothing
     */
    public void rotateString(char[] str, int offset) {
        // write your code here
        if(str==null||str.length<2) return;
        offset = offset%str.length;
        offset = str.length -1 - offset;
        reverse(str, 0, offset);
        reverse(str, offset+1, str.length-1);
        reverse(str, 0, str.length-1);
    }
    void reverse(char[]str, int left, int right){
        char temp;
        while(left<right){
            temp = str[left];
            str[left++] = str[right];
            str[right--] = temp;
        }
    }
}