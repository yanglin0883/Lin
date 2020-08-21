public class Solution {
    /**
     * @param n: the integer to be reversed
     * @return: the reversed integer
     */
    public int reverseInteger(int n) {
        // write your code here
        int num[] = new int[10];
        int i=0;
        while(n!=0)
        {
            num[i] = n%10;
            n /=10;
            i++;
        }
        i--;
        if(i==9)
        {
            if(num[0]>2||num[0]<-2) return 0;
            if(num[1]>1||num[1]<-1) return 0;
            if(num[2]>4||num[2]<-4) return 0;
            if(num[3]>7||num[3]<-7) return 0;
            if(num[4]>4||num[4]<-4) return 0;
            if(num[5]>8||num[5]<-8) return 0;
            if(num[6]>3||num[6]<-3) return 0;
            if(num[7]>6||num[7]<-6) return 0;
            if(num[8]>4||num[8]<-4) return 0;
            if(num[9]>7||num[9]<-8) return 0;
        }
        int res=0;
        System.out.println(i+"");
        int j=0;
        while(j<=i)
        {
            res += num[j];
            if(j<i)res *=10;
            j++;
        }
        return res;
    }
}