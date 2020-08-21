public class Solution {
    /**
     * @param n: An integer
     * @return: True or false
     */
    public boolean checkPowerOf2(int n) {
        // write your code here
        if(n<1) return false;
        n-=1;
        // System.out.println(n+"");
        while(n>0){
            if((n&1) ==0) return false;
            n>>=1;
            // System.out.println(n+"");
        }
        return true;
    }
}