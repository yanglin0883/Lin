public class Solution {
    /**
     * @param a: a integer represent the length of one edge
     * @param b: a integer represent the length of one edge
     * @param c: a integer represent the length of one edge
     * @return: whether three edges can form a triangle
     */
    public boolean isValidTriangle(int a, int b, int c) {
        // write your code here
        if(isTriangle(a,b,c)) return true;
        if(isTriangle(a,c,b)) return true;
        if(isTriangle(c,b,a)) return true;
        return false;
    }
    
    private boolean isTriangle(int a, int b, int c){
        // System.out.println(a+" "+b+" "+c);
        if(a+b>c && Math.abs(a-b)<c) return true;
        else return false;
    }
}