public class Solution {
    /**
     * @param nums1: an integer array
     * @param nums2: an integer array
     * @return: an integer array
     */
    public int[] intersection(int[] nums1, int[] nums2) {
        // write your code here
        if(nums1==null||nums2==null||nums1.length==0||nums2.length==0)return new int[0];
        TreeSet<Integer> res = new TreeSet<Integer>();
        TreeSet<Integer> n1 = new TreeSet<Integer>();
        for(int i=0;i<nums1.length;i++){
            n1.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            if(n1.contains(nums2[i])) res.add(nums2[i]);
        }
        Object[] r = res.toArray();
        int[] temp = new int[r.length];
        for(int i=0;i<r.length;i++){
            temp[i]=((Integer)r[i]).intValue(); 
        }
        return temp;
    }
}