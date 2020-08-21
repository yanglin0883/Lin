public class Solution {
    /**
     * @param num: a non negative integer number
     * @return: an array represent the number of 1's in their binary
     */
    public int[] countBits(int num) {
        // write your code here
        int[] res = new int[num+1];
        res[0]=0;
        // res[1]=1;
        for(int i=1;i<=num;i++){
            res[i] = countOnes(i);
        }
        return res;
    }
    public int countOnes(int num) {
        // write your code here
        int count =0;
        while(num!=0){
            if((num&1)==1) count ++;
            num>>>= 1;
        }
        return count;
    }
}