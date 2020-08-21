public class Solution {
    /**
     * @param numbers: An array of Integer
     * @param target: target = numbers[index1] + numbers[index2]
     * @return: [index1, index2] (index1 < index2)
     */
    public int[] twoSum(int[] numbers, int target) {
        // write your code here
        HashMap<Integer, Integer> hm = new HashMap();
        for(int i=0;i<numbers.length;i++){
            if(hm.containsKey(target-numbers[i])){
                return new int[]{ hm.get(target-numbers[i]),i};
            }
            hm.put(numbers[i], i);
        }
        // for(int i=0;i<numbers.length;i++){
            
        // }
        return null;
    }
}