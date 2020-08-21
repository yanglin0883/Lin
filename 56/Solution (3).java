public class Solution {
    /**
     * @param numbers: An array of Integer
     * @param target: target = numbers[index1] + numbers[index2]
     * @return: [index1, index2] (index1 < index2)
     */
    public int[] twoSum(int[] numbers, int target) {
        // write your code here
        int[][] n = new int[numbers.length][2];
        for(int i=0;i<numbers.length;i++){
            n[i][0]=numbers[i];
            n[i][1]=i;
        }
        Arrays.sort(n, (p1, p2)->p1[0]-p2[0]);
        int l=0, r = n.length-1;
        while(l<r){
            if(n[l][0]+n[r][0] == target) {
                int[]ans = new int[]{n[l][1], n[r][1]};
                if(ans[0]>ans[1]){
                    ans[0] = n[r][1];
                    ans[1] = n[l][1];
                }
                return ans;
            }
            else if(n[l][0]+n[r][0] < target) l++;
            else r--;
        }
        return null;
    }
}