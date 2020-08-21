public class Solution {
    /**
     * @param num: a string
     * @return: true if a number is strobogrammatic or false
     */
    public boolean isStrobogrammatic(String num) {
        // write your code here
        if(num==null||num.length()<1 || num.charAt(0)=='-') return false;
        char[] number = num.toCharArray();
        int left =0;
        int right = number.length-1;
        char[][] judge = {{'0','0'},{'1','1'},{'6','9'},{'8','8'},{'9','6'}};
        
        while(left<=right)
        {
            boolean flag =false;
            for(int i=0;i<5;i++)
            {
                if(number[left] == judge[i][0] && number[right]==judge[i][1]) flag = true;
                //真的可以倒置
            }
            if(!flag) return false;
            left++; right--;
        }
        return true;
    }
}