public class Solution {
    /**
     * @param digits: a number represented as an array of digits
     * @return: the result
     */
    public int[] plusOne(int[] digits) {
        // write your code here
        ArrayList<Integer> res = new ArrayList<Integer>();
        int len = digits.length;
        boolean addOne =true;
        while(--len >-1){
            if(addOne){
                int temp = digits[len]+1;
                if(temp>9) res.add(temp%10);
                else{
                    res.add(temp);
                    addOne = false;
                }
            }
            else{
                res.add(digits[len]);
            }
        }
        if(addOne) res.add(1);
        int size = res.size();
        int[] r= new int[size];
        len=0;
        for(;size>0;){
            r[len++] = res.get(--size);
            // System.out.println(size+"");
        }
        return r;
    }
}