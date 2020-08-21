public class Solution {
    /**
     * @param numbers: Give an array numbers of n integer
     * @param target: An integer
     * @return: return the sum of the three integers, the sum closest target.
     */
    public int threeSumClosest(int[] numbers, int target) {
        // write your code here
        if(numbers==null && numbers.length<3) return -1;
        int closest = numbers[0]+numbers[1]+numbers[2];
        Arrays.sort(numbers);
        for(int i=0;i<numbers.length;i++){
            int left = i+1, right = numbers.length-1;
            while(left<right){
                int sum = numbers[i]+numbers[left]+numbers[right];
                if(Math.abs(target-sum)<Math.abs(target-closest)) closest = sum;
                if(sum<target)left++;
                else right--;
            }
        }
        return closest;
    }
}