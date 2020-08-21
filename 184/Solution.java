public class Solution {
    /**
     * @param nums: A list of non negative integers
     * @return: A string
     */
    public String largestNumber(int[] nums) {
        // write your code here
        String[] n = new String[nums.length];
        for(int i=0;i<n.length;i++){
            n[i] = Integer.toString(nums[i]);
        }
        Arrays.sort(n, (p1, p2)->{
            return (p1+p2).compareTo(p2+p1);
        });
        StringBuilder sb = new StringBuilder();
        for(int i=n.length-1;i>-1;i--)
            sb.append(n[i]);
        while(sb.length()>1&&sb.charAt(0)=='0'){
            // System.out.println(i+"  " +sb.toString());
            sb.deleteCharAt(0);
        }
        return sb.toString();
    }
}