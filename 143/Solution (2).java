public class Solution {
    /**
     * @param colors: A list of integer
     * @param k: An integer
     * @return: nothing
     */
    public void sortColors2(int[] colors, int k) {
        // write your code here
        if(colors==null || colors.length<2) return;
        int[] single = new int[k+1];
        for(int i:colors){
            single[i]++;
        }
        int index=0;
        for(int i=0;i<colors.length;i++){
            while(single[index]==0)index++;
            colors[i] = index;
            single[index]--;
        }
    }
}