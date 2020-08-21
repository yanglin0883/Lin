public class Solution {
    /**
     * @param colors: A list of integer
     * @param k: An integer
     * @return: nothing
     */
    public void sortColors2(int[] colors, int k) {
        // write your code here
        if(colors==null || colors.length<2) return;
        helper(colors, 0, colors.length-1, 1, k);
    }
    
    void helper(int[] arr, int left, int right, int colorLeft, int colorRight){
        if(colorRight == colorLeft || left>=right) return;
        int targetColor  = (colorLeft + colorRight) /2;
        int l = left, r = right;
        while(l<=r){
            while(l<=r && arr[l]<=targetColor) l++;
            while(l<=r && arr[r]> targetColor) r--;
            if(l<=r){
                int temp = arr[l];
                arr[l++] = arr[r];
                arr[r--] = temp;
            }
        }
        helper(arr, left, r, colorLeft, targetColor);
        helper(arr, l, right, targetColor+1, colorRight);
    }
}