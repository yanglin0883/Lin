public class Solution {
    /*
     * @param chars: The letter array you should sort by Case
     * @return: nothing
     */
    public void sortLetters(char[] chars) {
        // write your code here
        if(chars ==null || chars.length == 0) return;
        int len  = chars.length;
        int left=0, right = len-1;
        while(left<right)
        {
            while(left<right &&chars[left]>='a') left++;
            while(left<right && chars[right]<'a') right--;
        //    System.out.println(left+"  "+right);
            swap(chars, left, right);
            left++;right--;
        }
    }
    
    private void swap(char[] a, int i, int j)
    {
        char temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}