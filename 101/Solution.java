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
        int len = nums.length;
        int res = len;
        for(int i=0;i<len;i++)
        {
            if(!hm.containsKey(nums[i])) hm.put(nums[i], 1);
            else
            {
                int temp = hm.get(nums[i]);
                // System.out.println("run: "+temp+"  "+nums[i]);
                if(temp <2) hm.put(nums[i] ,temp+1);
                else 
                {
                    
                    int t = nums[--len];
                    nums[len] = nums[i];
                    nums[i--] = t;
                }
            }
            // System.out.println(hm.keySet());
            // for(int k=0;k<nums.length;k++) System.out.print(nums[k]+", ");
            // System.out.println();
        }
        return len;
    }
}