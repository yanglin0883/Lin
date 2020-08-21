public class Solution {
    /**
     * @param n: An integer
     * @return: true if this is a happy number or false
     */
    public boolean isHappy(int n) {
        // write your code here
        if(n< 1) return false;
        ArrayList<Integer> nums = new ArrayList<Integer>();
        while(n != 1){
            if(nums.contains(n)) return false;
            else{
                nums.add(n);
                n = toBeHappy(n);
            }
            // System.out.println(n+"");
            // System.out.println(nums);
        }
        return true;
    }
    
    private int toBeHappy(int a){
        long sum=0;
        while(a>0){
            sum = sum + square(a%10);
            a /= 10;
        }
        return (int)sum;
    }
    
    private int square(int a){
        return a*a;
    }
}