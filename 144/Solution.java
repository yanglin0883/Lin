public class Solution {
    /*
     * @param A: An integer array.
     * @return: nothing
     */
    public void rerange(int[] A) {
        // write your code here
        if(A==null||A.length<2) return;
        int count=0;
        for(int i:A)if(i>0) count++;
        int neg = 0;
        int pos = 1;
        if(count*2>A.length){neg=1;pos=0;}
        while(neg<A.length &&pos<A.length){
            while(neg<A.length && A[neg]<0) neg+=2;
            while(pos<A.length && A[pos]>0) pos+=2;
            if(neg<A.length &&pos<A.length){
                int temp = A[pos];
                A[pos] = A[neg];
                A[neg] = temp;
            }
        }
    }
}