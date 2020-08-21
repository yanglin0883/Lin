public class Solution {
    /**
     * @param A: a array of integers
     * @return : return an integer
     */
    public int removeDuplicates(int[] nums) {
        // write your code here
        if(nums == null) return 0;
        if(nums.length <3) return nums.length;
        Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
        ArrayList<Integer> n = new ArrayList<Integer>();
        int len = nums.length;
        // int res = len;
        for(int i=0;i<len;i++)
        {
            if(!hm.containsKey(nums[i])) {
                hm.put(nums[i], 1);
                n.add(nums[i]);
                // System.out.println(i);
            }
            else
            {
                int temp = hm.get(nums[i]);
                 System.out.println("run: "+nums[i]+"  "+temp);
                if(temp <2) {
                    hm.put(nums[i] ,temp+1);
                    n.add(nums[i]);
                }
            }
            // for(int k=0;k<nums.length;k++) System.out.print(nums[k]+", ");
            // 
        }
        int i=0;
        for(Integer j: n)
        {
            nums[i++] = j;
        }
        // System.out.println(n);
        return i;
    }
}