public class Solution {
    /**
     * @param timeSeries: the Teemo's attacking ascending time series towards Ashe
     * @param duration: the poisoning time duration per Teemo's attacking
     * @return: the total time that Ashe is in poisoned condition
     */
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        // Write your code here
        int res = timeSeries.length *duration;
        for(int i=1;i<timeSeries.length;i++){
            int temp = timeSeries[i]- timeSeries[i-1]-duration;
            if(temp <0) res += temp;
        }
        return res;
    }
}