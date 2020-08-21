public class Solution {
    /**
     * @param numbers: Give an array numbers of n integer
     * @return: Find all unique triplets in the array which gives the sum of zero.
     */
    public List<List<Integer>> threeSum(int[] numbers) {
        // write your code here
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(numbers == null||numbers.length < 3)return res;
        Arrays.sort(numbers);
        // for(int i=0;i<numbers.length;i++)
        // System.out.println(numbers[i]);
        for(int i=0;i<numbers.length-2;i++)
        {
            int left=i+1, right=numbers.length-1;
            while(left<right)
            {
            //     System.out.println(i+" :: "+left+" :: "+right);
                if(numbers[i] +numbers[left] + numbers[right] ==0)
                {
                    if(contains(res,numbers[i],numbers[left],numbers[right])) {left++;continue;}
                    ArrayList<Integer> al = new ArrayList<Integer>();
                    al.add(numbers[i]);
                    al.add(numbers[left]);
                    al.add(numbers[right]);
                    res.add(al);
                //    continue T1;
                }
            //     System.out.println(res);
                if(numbers[i] +numbers[left] + numbers[right] < 0) left++;
                if(numbers[i] +numbers[left] + numbers[right] > 0) right--;
            }
        }
        return res;
    }
    
    private boolean contains(List<List<Integer>> res, int a, int b, int c)
    {
        for(List<Integer> i: res)
        {
            if(i.get(0) == a &&i.get(1) == b && i.get(2) == c)
                return true;
        }
        return false;
    }
}