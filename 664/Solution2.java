public class Solution {
    /**
     * @param num: a non negative integer number
     * @return: an array represent the number of 1's in their binary
     */
    public int[] countBits(int num) {
        // write your code here
        int[] res =new int[num+1];
        res[0] =0;
        for(int i=1;i<=num;i++){
            res[i]=res[i&(i-1)]+1;
        }
        return res;
    }
}