class Solution {
    public int nthUglyNumber(int n, int a, int b, int c) {
        long ab, bc, ac, abc, l=1, r=2147483647, mid, temp;
        if(a>=b&&a>c){
            temp = a;
            a = c;
            c = (int)temp;
        }else if(b>=a&&b>c){
            temp = b;
            b = c;
            c = (int)temp;
        }
        ab = a/gcd(a,b)*b;
        bc = b/gcd(b,c)*c;
        ac = a/gcd(a,c)*c;
        abc = ab / gcd(ab,c)* c; 
        // System.out.println(ab+"  "+bc+"  "+ac+"  "+abc);
        while(l<=r){
            mid = l+r>>1;
            temp = mid/a+mid/b+mid/c - mid/ab-mid/bc-mid/ac + mid/abc;
            //System.out.println(temp);
            if(temp <n) l = mid+1;
            else r = mid-1;
        }
        return (int)l;
    }
    long gcd(long a, long b){
        if(b>a) return gcd(b,a);
        if(a%b == 0) return b;
        return gcd(a%b, b);
    }
}