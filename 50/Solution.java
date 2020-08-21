public class Solution {
    /*
     * @param nums: Given an integers array A
     * @return: A long long array B and B[i]= A[0] * ... * A[i-1] * A[i+1] * ... * A[n-1]
     */
    public List<Long> productExcludeItself(List<Integer> nums) {
        // write your code here
        if(nums.size() == 0)
            return null;
        List<Long> al = new ArrayList<Long>();
        if(nums.size()==1)
        {
            al.add(new Long(1));
            return al;
        }
        long front[] = new long [nums.size()];
        front[0] = nums.get(0);
        long back[] = new long [nums.size()];
        back[back.length-1] = nums.get(nums.size()-1);
        for(int i=1;i<nums.size();i++)
        {
            front[i] = front[i-1] *nums.get(i);
     //       System.out.println("front::"+front[i]);
        }
        for(int i=nums.size()-2;i>-1;i--)
        {
            back[i] = back[i+1] * nums.get(i);
    //        System.out.println("back::"+back[i]);
        }
        
        al.add(back[1]);
        for(int i=1;i<nums.size()-1;i++)
        {
                al.add(front[i-1]*back[i+1]);
      //          System.out.println("front= "+front[i-1]+" back= "+back[i+1]);
        }
        al.add(front[nums.size()-2]);
        return al;
    }
}