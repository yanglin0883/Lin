public class Solution {
    /**
     * @param height: A list of integer
     * @return: The area of largest rectangle in the histogram
     */
    public int largestRectangleArea(int[] height) {
        // write your code here
        Stack<Integer> S = new Stack<>();
        height = Arrays.copyOf(height, height.length+1);
        int sum=0;
        for(int i=0;i<height.length;i++){
            if(S.empty()||height[i]>height[S.peek()])S.push(i);
            else{
                int temp = S.pop().intValue();
                sum = Math.max(sum, height[temp]*(S.empty()? i : i-S.peek()-1));
                i--;
            }
        }
        return sum;
    }
}