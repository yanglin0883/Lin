public class Solution {
    /**
     * @param num: An integer
     * @return: true if num is an ugly number or false
     */
    public boolean isUgly(int num) {
        // write your code here
        if(num < 1) return false;
        int[] factor = {2,3,5};
        for(int f : factor)
        {
            while(num % f == 0) num /=f;
            System.out.println(num+":::"+f);
        }
        if(num == 1) return true;
        else return false;
    }
}