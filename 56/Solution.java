public class Solution {
    /**
     * @param numbers: An array of Integer
     * @param target: target = numbers[index1] + numbers[index2]
     * @return: [index1, index2] (index1 < index2)
     */
    public int[] twoSum(int[] numbers, int target) {
        // write your code here
        int len =numbers.length;
        for(int i=0;i<len-1;i++)
        {
            for(int j=i+1;j<len;j++)
            {
                if(numbers[i] + numbers[j] == target)
                {
                    int[] a =new int[2];
                    a[0] = i;
                    a[1] = j;
                    return a;
                }
            }
        }
        return null;
    }
}