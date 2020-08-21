public class Solution {
    /**
     * @param n: an integer
     * @return: an ineger f(n)
     */
    public int fibonacci(int n) {
        // write your code here
        //if(n <= 1) return 0;
        //if(n == 2) return 1;
        //return fibonacci(n-1) + fibonacci(n-2);
        return fib(n, 0, 1);
    }
    private int fib(int n, int a, int b){
        if( n == 1 ) return 0;
        if( n == 2 ) return b;
        int temp = a + b;
        return fib(n-1, b, temp );
    }
}