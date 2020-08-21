public class Solution {
    /**
     * @param num: a non-negative integer
     * @return: one digit
     */
    public int addDigits(int num) {
        // write your code here
        while(num>9){
            num = doit(num);
        } 
        return num;
    }
    
    private int doit(int a){
        int sum =0;
        while(a>0){
            sum+=a%10;
            a/=10;
        }
        return sum;
    }
}